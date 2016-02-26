/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-02-18 22:11:37 UTC)
 * on 2016-02-26 at 01:07:31 UTC 
 * Modify at your own risk.
 */

package com.appspot.tbatv_prod_hrd.tbaMobile;

/**
 * Service definition for TbaMobile (v9).
 *
 * <p>
 * API for TBA Mobile clients
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link TbaMobileRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class TbaMobile extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.21.0 of the tbaMobile library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://tbatv-prod-hrd.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "tbaMobile/v9/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public TbaMobile(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  TbaMobile(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Favorites collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code TbaMobile tbaMobile = new TbaMobile(...);}
   *   {@code TbaMobile.Favorites.List request = tbaMobile.favorites().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Favorites favorites() {
    return new Favorites();
  }

  /**
   * The "favorites" collection of methods.
   */
  public class Favorites {

    /**
     * Create a request for the method "favorites.list".
     *
     * This request holds the parameters needed by the tbaMobile server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends TbaMobileRequest<com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesFavoriteCollection> {

      private static final String REST_PATH = "favorites/list";

      /**
       * Create a request for the method "favorites.list".
       *
       * This request holds the parameters needed by the the tbaMobile server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(TbaMobile.this, "POST", REST_PATH, null, com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesFavoriteCollection.class);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Model collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code TbaMobile tbaMobile = new TbaMobile(...);}
   *   {@code TbaMobile.Model.List request = tbaMobile.model().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Model model() {
    return new Model();
  }

  /**
   * The "model" collection of methods.
   */
  public class Model {

    /**
     * Create a request for the method "model.setPreferences".
     *
     * This request holds the parameters needed by the tbaMobile server.  After setting any optional
     * parameters, call the {@link SetPreferences#execute()} method to invoke the remote operation.
     *
     * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesModelPreferenceMessage}
     * @return the request
     */
    public SetPreferences setPreferences(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesModelPreferenceMessage content) throws java.io.IOException {
      SetPreferences result = new SetPreferences(content);
      initialize(result);
      return result;
    }

    public class SetPreferences extends TbaMobileRequest<com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse> {

      private static final String REST_PATH = "model/setPreferences";

      /**
       * Create a request for the method "model.setPreferences".
       *
       * This request holds the parameters needed by the the tbaMobile server.  After setting any
       * optional parameters, call the {@link SetPreferences#execute()} method to invoke the remote
       * operation. <p> {@link SetPreferences#initialize(com.google.api.client.googleapis.services.Abstr
       * actGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesModelPreferenceMessage}
       * @since 1.13
       */
      protected SetPreferences(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesModelPreferenceMessage content) {
        super(TbaMobile.this, "POST", REST_PATH, content, com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse.class);
      }

      @Override
      public SetPreferences setAlt(java.lang.String alt) {
        return (SetPreferences) super.setAlt(alt);
      }

      @Override
      public SetPreferences setFields(java.lang.String fields) {
        return (SetPreferences) super.setFields(fields);
      }

      @Override
      public SetPreferences setKey(java.lang.String key) {
        return (SetPreferences) super.setKey(key);
      }

      @Override
      public SetPreferences setOauthToken(java.lang.String oauthToken) {
        return (SetPreferences) super.setOauthToken(oauthToken);
      }

      @Override
      public SetPreferences setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (SetPreferences) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public SetPreferences setQuotaUser(java.lang.String quotaUser) {
        return (SetPreferences) super.setQuotaUser(quotaUser);
      }

      @Override
      public SetPreferences setUserIp(java.lang.String userIp) {
        return (SetPreferences) super.setUserIp(userIp);
      }

      @Override
      public SetPreferences set(String parameterName, Object value) {
        return (SetPreferences) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Subscriptions collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code TbaMobile tbaMobile = new TbaMobile(...);}
   *   {@code TbaMobile.Subscriptions.List request = tbaMobile.subscriptions().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Subscriptions subscriptions() {
    return new Subscriptions();
  }

  /**
   * The "subscriptions" collection of methods.
   */
  public class Subscriptions {

    /**
     * Create a request for the method "subscriptions.list".
     *
     * This request holds the parameters needed by the tbaMobile server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @return the request
     */
    public List list() throws java.io.IOException {
      List result = new List();
      initialize(result);
      return result;
    }

    public class List extends TbaMobileRequest<com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesSubscriptionCollection> {

      private static final String REST_PATH = "subscriptions/list";

      /**
       * Create a request for the method "subscriptions.list".
       *
       * This request holds the parameters needed by the the tbaMobile server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @since 1.13
       */
      protected List() {
        super(TbaMobile.this, "POST", REST_PATH, null, com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesSubscriptionCollection.class);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUserIp(java.lang.String userIp) {
        return (List) super.setUserIp(userIp);
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * An accessor for creating requests from the Team collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code TbaMobile tbaMobile = new TbaMobile(...);}
   *   {@code TbaMobile.Team.List request = tbaMobile.team().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Team team() {
    return new Team();
  }

  /**
   * The "team" collection of methods.
   */
  public class Team {

    /**
     * An accessor for creating requests from the Media collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code TbaMobile tbaMobile = new TbaMobile(...);}
     *   {@code TbaMobile.Media.List request = tbaMobile.media().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Media media() {
      return new Media();
    }

    /**
     * The "media" collection of methods.
     */
    public class Media {

      /**
       * Create a request for the method "media.suggestion".
       *
       * This request holds the parameters needed by the tbaMobile server.  After setting any optional
       * parameters, call the {@link Suggestion#execute()} method to invoke the remote operation.
       *
       * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesMediaSuggestionMessage}
       * @return the request
       */
      public Suggestion suggestion(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesMediaSuggestionMessage content) throws java.io.IOException {
        Suggestion result = new Suggestion(content);
        initialize(result);
        return result;
      }

      public class Suggestion extends TbaMobileRequest<com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse> {

        private static final String REST_PATH = "team/media/suggest";

        /**
         * Create a request for the method "media.suggestion".
         *
         * This request holds the parameters needed by the the tbaMobile server.  After setting any
         * optional parameters, call the {@link Suggestion#execute()} method to invoke the remote
         * operation. <p> {@link
         * Suggestion#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
         * must be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesMediaSuggestionMessage}
         * @since 1.13
         */
        protected Suggestion(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesMediaSuggestionMessage content) {
          super(TbaMobile.this, "POST", REST_PATH, content, com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse.class);
        }

        @Override
        public Suggestion setAlt(java.lang.String alt) {
          return (Suggestion) super.setAlt(alt);
        }

        @Override
        public Suggestion setFields(java.lang.String fields) {
          return (Suggestion) super.setFields(fields);
        }

        @Override
        public Suggestion setKey(java.lang.String key) {
          return (Suggestion) super.setKey(key);
        }

        @Override
        public Suggestion setOauthToken(java.lang.String oauthToken) {
          return (Suggestion) super.setOauthToken(oauthToken);
        }

        @Override
        public Suggestion setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Suggestion) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Suggestion setQuotaUser(java.lang.String quotaUser) {
          return (Suggestion) super.setQuotaUser(quotaUser);
        }

        @Override
        public Suggestion setUserIp(java.lang.String userIp) {
          return (Suggestion) super.setUserIp(userIp);
        }

        @Override
        public Suggestion set(String parameterName, Object value) {
          return (Suggestion) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Create a request for the method "register".
   *
   * This request holds the parameters needed by the tbaMobile server.  After setting any optional
   * parameters, call the {@link Register#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest}
   * @return the request
   */
  public Register register(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest content) throws java.io.IOException {
    Register result = new Register(content);
    initialize(result);
    return result;
  }

  public class Register extends TbaMobileRequest<com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse> {

    private static final String REST_PATH = "register";

    /**
     * Create a request for the method "register".
     *
     * This request holds the parameters needed by the the tbaMobile server.  After setting any
     * optional parameters, call the {@link Register#execute()} method to invoke the remote operation.
     * <p> {@link
     * Register#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest}
     * @since 1.13
     */
    protected Register(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest content) {
      super(TbaMobile.this, "POST", REST_PATH, content, com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse.class);
    }

    @Override
    public Register setAlt(java.lang.String alt) {
      return (Register) super.setAlt(alt);
    }

    @Override
    public Register setFields(java.lang.String fields) {
      return (Register) super.setFields(fields);
    }

    @Override
    public Register setKey(java.lang.String key) {
      return (Register) super.setKey(key);
    }

    @Override
    public Register setOauthToken(java.lang.String oauthToken) {
      return (Register) super.setOauthToken(oauthToken);
    }

    @Override
    public Register setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Register) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Register setQuotaUser(java.lang.String quotaUser) {
      return (Register) super.setQuotaUser(quotaUser);
    }

    @Override
    public Register setUserIp(java.lang.String userIp) {
      return (Register) super.setUserIp(userIp);
    }

    @Override
    public Register set(String parameterName, Object value) {
      return (Register) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "unregister".
   *
   * This request holds the parameters needed by the tbaMobile server.  After setting any optional
   * parameters, call the {@link Unregister#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest}
   * @return the request
   */
  public Unregister unregister(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest content) throws java.io.IOException {
    Unregister result = new Unregister(content);
    initialize(result);
    return result;
  }

  public class Unregister extends TbaMobileRequest<com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse> {

    private static final String REST_PATH = "unregister";

    /**
     * Create a request for the method "unregister".
     *
     * This request holds the parameters needed by the the tbaMobile server.  After setting any
     * optional parameters, call the {@link Unregister#execute()} method to invoke the remote
     * operation. <p> {@link
     * Unregister#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest}
     * @since 1.13
     */
    protected Unregister(com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesRegistrationRequest content) {
      super(TbaMobile.this, "POST", REST_PATH, content, com.appspot.tbatv_prod_hrd.tbaMobile.model.ModelsMobileApiMessagesBaseResponse.class);
    }

    @Override
    public Unregister setAlt(java.lang.String alt) {
      return (Unregister) super.setAlt(alt);
    }

    @Override
    public Unregister setFields(java.lang.String fields) {
      return (Unregister) super.setFields(fields);
    }

    @Override
    public Unregister setKey(java.lang.String key) {
      return (Unregister) super.setKey(key);
    }

    @Override
    public Unregister setOauthToken(java.lang.String oauthToken) {
      return (Unregister) super.setOauthToken(oauthToken);
    }

    @Override
    public Unregister setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (Unregister) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public Unregister setQuotaUser(java.lang.String quotaUser) {
      return (Unregister) super.setQuotaUser(quotaUser);
    }

    @Override
    public Unregister setUserIp(java.lang.String userIp) {
      return (Unregister) super.setUserIp(userIp);
    }

    @Override
    public Unregister set(String parameterName, Object value) {
      return (Unregister) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link TbaMobile}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link TbaMobile}. */
    @Override
    public TbaMobile build() {
      return new TbaMobile(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link TbaMobileRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setTbaMobileRequestInitializer(
        TbaMobileRequestInitializer tbamobileRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(tbamobileRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
