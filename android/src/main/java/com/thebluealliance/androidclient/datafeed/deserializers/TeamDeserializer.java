package com.thebluealliance.androidclient.datafeed.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.thebluealliance.androidclient.models.Team;

import java.lang.reflect.Type;


public class TeamDeserializer implements JsonDeserializer<Team>{
	
	@Override
	public Team deserialize(final JsonElement json, Type typeOf, JsonDeserializationContext context) throws JsonParseException {
		final JsonObject object = json.getAsJsonObject();
		final Team team = new Team();
		
		team.setTeamKey(object.get("key").getAsString());
		team.setTeamNumber(object.get("team_number").getAsInt());
		team.setFullName(object.get("name").getAsString());
		team.setNickname(object.get("nickname").getAsString());
		team.setLocation(object.get("location").getAsString());
		team.setEvents(object.get("events").getAsJsonArray());
		team.setWebsite(object.get("website").getAsString());
		team.setLastUpdated(System.currentTimeMillis());
		
		return team;
	}

}
