package com.thebluealliance.androidclient.datafeed;

import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.thebluealliance.androidclient.models.SimpleEvent;
import com.thebluealliance.androidclient.models.SimpleTeam;
import com.thebluealliance.androidclient.models.Team;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Nathan on 4/30/2014.
 */
public class DataManager {

    private static final String ALL_TEAMS_LOADED_TO_DATABASE = "all_teams_loaded";

    public static Team getTeam(Context c, String teamKey) throws NoDataException {
        final String URL = "http://thebluealliance.com/api/v2/team/" + teamKey;
        String response = getResponseFromURLOrThrow(c, URL, true);
        Team team = JSONManager.getGson().fromJson(response, Team.class);
        System.out.println("events: " + team.getEvents().toString());
        return team;
    }

    public static ArrayList<SimpleEvent> getSimpleEventsForTeamInYear(Context c, String teamKey, int year) throws NoDataException {
        ArrayList<SimpleEvent> events = new ArrayList<>();
        // This will throw an exception if there is no local data and no internet connection
        // We want this to propagate up the stack
        Team team = getTeam(c, teamKey);
        JsonArray jsonEvents = team.getEvents();
        for (int i = 0; i < jsonEvents.size(); i++) {
            JsonObject currentEvent = jsonEvents.get(i).getAsJsonObject();
            SimpleEvent event = JSONManager.getGson().fromJson(currentEvent, SimpleEvent.class);
            events.add(event);
        }
        return events;
    }

    public static ArrayList<SimpleTeam> getSimpleTeamsInRange(Context c, int lowerBound, int upperBound) throws NoDataException {
        ArrayList<SimpleTeam> teams = new ArrayList<>();
        boolean allTeamsLoaded = PreferenceManager.getDefaultSharedPreferences(c).getBoolean(ALL_TEAMS_LOADED_TO_DATABASE, false);
        // TODO check for updated data from the API
        if (allTeamsLoaded) {
            // All teams exist in the database; we can query from there
            // TODO perform the query for teams withing the designated range
        } else {
            // We need to load teams from the API
            final String URL = "http://www.thebluealliance.com/api/csv/teams/all?X-TBA-App-Id=greg:marra:hi";
            String response = getResponseFromURLOrThrow(c, URL, false);
            teams = CSVManager.parseTeamsFromCSV(response);
            Iterator<SimpleTeam> i = teams.iterator();
            while (i.hasNext()) {
                SimpleTeam team = i.next();
                if (team.getTeamNumber() < lowerBound || team.getTeamNumber() > upperBound) {
                    i.remove();
                }
            }
        }

        return teams;
    }

    public static class NoDataException extends Exception {
        public NoDataException(String message) {
            super(message);
        }

        public NoDataException(String message, Throwable t) {
            super(message, t);
        }
    }

    private static String getResponseFromURLOrThrow(Context c, final String URL, boolean cacheInDatabase) throws NoDataException {
        Database db = Database.getInstance(c);
        boolean existsInDb = db.exists(URL);
        boolean connectedToInternet = ConnectionDetector.isConnectedToInternet(c);
        if (existsInDb) {
            if (connectedToInternet) {
                // We are connected to the internet and have a record in the database.
                // Check if the local copy is up-to-date; if it is, return it.
                // Otherwise, requery the API, cache the new data, and return the data.
                // TODO: once we support the If-Modified-Since header, use that to check if our local copy is up-to-date.
                // For now, we just load the new data every time.

                Log.d("datamanager", "Online; loaded from database");
                return db.getResponse(URL);
            } else {
                Log.d("datamanager", "Offline; loaded from database");
                return db.getResponse(URL);
            }
        } else {
            if (connectedToInternet) {
                // Load team data, cache it in the database, return it to caller
                String response = HTTP.GET(URL);
                if (cacheInDatabase) {
                    db.storeResponse(URL, response, -1);
                }
                Log.d("datamanager", "Online; loaded from internet");
                return response;
            } else {
                // There is no locally stored data and we are not connected to the internet.
                Log.d("datamanager", "Offline; no data!");
                throw new NoDataException("There is no internet connection and no local cache for this team!");
            }
        }
    }
}
