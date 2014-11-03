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
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-10-28 17:08:27 UTC)
 * on 2014-11-03 at 09:34:01 UTC 
 * Modify at your own risk.
 */

package com.google.doc_it.checkinendpoint;

/**
 * Service definition for Checkinendpoint (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CheckinendpointRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Checkinendpoint extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the checkinendpoint library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://myapp.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "checkinendpoint/v1/";

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
  public Checkinendpoint(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Checkinendpoint(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "getCheckIn".
   *
   * This request holds the parameters needed by the checkinendpoint server.  After setting any
   * optional parameters, call the {@link GetCheckIn#execute()} method to invoke the remote operation.
   *
   * @param id
   * @return the request
   */
  public GetCheckIn getCheckIn(java.lang.Long id) throws java.io.IOException {
    GetCheckIn result = new GetCheckIn(id);
    initialize(result);
    return result;
  }

  public class GetCheckIn extends CheckinendpointRequest<com.google.doc_it.checkinendpoint.model.CheckIn> {

    private static final String REST_PATH = "checkin/{id}";

    /**
     * Create a request for the method "getCheckIn".
     *
     * This request holds the parameters needed by the the checkinendpoint server.  After setting any
     * optional parameters, call the {@link GetCheckIn#execute()} method to invoke the remote
     * operation. <p> {@link
     * GetCheckIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected GetCheckIn(java.lang.Long id) {
      super(Checkinendpoint.this, "GET", REST_PATH, null, com.google.doc_it.checkinendpoint.model.CheckIn.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public GetCheckIn setAlt(java.lang.String alt) {
      return (GetCheckIn) super.setAlt(alt);
    }

    @Override
    public GetCheckIn setFields(java.lang.String fields) {
      return (GetCheckIn) super.setFields(fields);
    }

    @Override
    public GetCheckIn setKey(java.lang.String key) {
      return (GetCheckIn) super.setKey(key);
    }

    @Override
    public GetCheckIn setOauthToken(java.lang.String oauthToken) {
      return (GetCheckIn) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCheckIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCheckIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCheckIn setQuotaUser(java.lang.String quotaUser) {
      return (GetCheckIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCheckIn setUserIp(java.lang.String userIp) {
      return (GetCheckIn) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public GetCheckIn setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public GetCheckIn set(String parameterName, Object value) {
      return (GetCheckIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "insertCheckIn".
   *
   * This request holds the parameters needed by the checkinendpoint server.  After setting any
   * optional parameters, call the {@link InsertCheckIn#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.google.doc_it.checkinendpoint.model.CheckIn}
   * @return the request
   */
  public InsertCheckIn insertCheckIn(com.google.doc_it.checkinendpoint.model.CheckIn content) throws java.io.IOException {
    InsertCheckIn result = new InsertCheckIn(content);
    initialize(result);
    return result;
  }

  public class InsertCheckIn extends CheckinendpointRequest<com.google.doc_it.checkinendpoint.model.CheckIn> {

    private static final String REST_PATH = "checkin";

    /**
     * Create a request for the method "insertCheckIn".
     *
     * This request holds the parameters needed by the the checkinendpoint server.  After setting any
     * optional parameters, call the {@link InsertCheckIn#execute()} method to invoke the remote
     * operation. <p> {@link InsertCheckIn#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.google.doc_it.checkinendpoint.model.CheckIn}
     * @since 1.13
     */
    protected InsertCheckIn(com.google.doc_it.checkinendpoint.model.CheckIn content) {
      super(Checkinendpoint.this, "POST", REST_PATH, content, com.google.doc_it.checkinendpoint.model.CheckIn.class);
    }

    @Override
    public InsertCheckIn setAlt(java.lang.String alt) {
      return (InsertCheckIn) super.setAlt(alt);
    }

    @Override
    public InsertCheckIn setFields(java.lang.String fields) {
      return (InsertCheckIn) super.setFields(fields);
    }

    @Override
    public InsertCheckIn setKey(java.lang.String key) {
      return (InsertCheckIn) super.setKey(key);
    }

    @Override
    public InsertCheckIn setOauthToken(java.lang.String oauthToken) {
      return (InsertCheckIn) super.setOauthToken(oauthToken);
    }

    @Override
    public InsertCheckIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (InsertCheckIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public InsertCheckIn setQuotaUser(java.lang.String quotaUser) {
      return (InsertCheckIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public InsertCheckIn setUserIp(java.lang.String userIp) {
      return (InsertCheckIn) super.setUserIp(userIp);
    }

    @Override
    public InsertCheckIn set(String parameterName, Object value) {
      return (InsertCheckIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "listCheckIn".
   *
   * This request holds the parameters needed by the checkinendpoint server.  After setting any
   * optional parameters, call the {@link ListCheckIn#execute()} method to invoke the remote
   * operation.
   *
   * @return the request
   */
  public ListCheckIn listCheckIn() throws java.io.IOException {
    ListCheckIn result = new ListCheckIn();
    initialize(result);
    return result;
  }

  public class ListCheckIn extends CheckinendpointRequest<com.google.doc_it.checkinendpoint.model.CollectionResponseCheckIn> {

    private static final String REST_PATH = "checkin";

    /**
     * Create a request for the method "listCheckIn".
     *
     * This request holds the parameters needed by the the checkinendpoint server.  After setting any
     * optional parameters, call the {@link ListCheckIn#execute()} method to invoke the remote
     * operation. <p> {@link
     * ListCheckIn#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @since 1.13
     */
    protected ListCheckIn() {
      super(Checkinendpoint.this, "GET", REST_PATH, null, com.google.doc_it.checkinendpoint.model.CollectionResponseCheckIn.class);
    }

    @Override
    public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
      return super.executeUsingHead();
    }

    @Override
    public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
      return super.buildHttpRequestUsingHead();
    }

    @Override
    public ListCheckIn setAlt(java.lang.String alt) {
      return (ListCheckIn) super.setAlt(alt);
    }

    @Override
    public ListCheckIn setFields(java.lang.String fields) {
      return (ListCheckIn) super.setFields(fields);
    }

    @Override
    public ListCheckIn setKey(java.lang.String key) {
      return (ListCheckIn) super.setKey(key);
    }

    @Override
    public ListCheckIn setOauthToken(java.lang.String oauthToken) {
      return (ListCheckIn) super.setOauthToken(oauthToken);
    }

    @Override
    public ListCheckIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (ListCheckIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public ListCheckIn setQuotaUser(java.lang.String quotaUser) {
      return (ListCheckIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public ListCheckIn setUserIp(java.lang.String userIp) {
      return (ListCheckIn) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String cursor;

    /**

     */
    public java.lang.String getCursor() {
      return cursor;
    }

    public ListCheckIn setCursor(java.lang.String cursor) {
      this.cursor = cursor;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.Integer limit;

    /**

     */
    public java.lang.Integer getLimit() {
      return limit;
    }

    public ListCheckIn setLimit(java.lang.Integer limit) {
      this.limit = limit;
      return this;
    }

    @Override
    public ListCheckIn set(String parameterName, Object value) {
      return (ListCheckIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "removeCheckIn".
   *
   * This request holds the parameters needed by the checkinendpoint server.  After setting any
   * optional parameters, call the {@link RemoveCheckIn#execute()} method to invoke the remote
   * operation.
   *
   * @param id
   * @return the request
   */
  public RemoveCheckIn removeCheckIn(java.lang.Long id) throws java.io.IOException {
    RemoveCheckIn result = new RemoveCheckIn(id);
    initialize(result);
    return result;
  }

  public class RemoveCheckIn extends CheckinendpointRequest<Void> {

    private static final String REST_PATH = "checkin/{id}";

    /**
     * Create a request for the method "removeCheckIn".
     *
     * This request holds the parameters needed by the the checkinendpoint server.  After setting any
     * optional parameters, call the {@link RemoveCheckIn#execute()} method to invoke the remote
     * operation. <p> {@link RemoveCheckIn#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param id
     * @since 1.13
     */
    protected RemoveCheckIn(java.lang.Long id) {
      super(Checkinendpoint.this, "DELETE", REST_PATH, null, Void.class);
      this.id = com.google.api.client.util.Preconditions.checkNotNull(id, "Required parameter id must be specified.");
    }

    @Override
    public RemoveCheckIn setAlt(java.lang.String alt) {
      return (RemoveCheckIn) super.setAlt(alt);
    }

    @Override
    public RemoveCheckIn setFields(java.lang.String fields) {
      return (RemoveCheckIn) super.setFields(fields);
    }

    @Override
    public RemoveCheckIn setKey(java.lang.String key) {
      return (RemoveCheckIn) super.setKey(key);
    }

    @Override
    public RemoveCheckIn setOauthToken(java.lang.String oauthToken) {
      return (RemoveCheckIn) super.setOauthToken(oauthToken);
    }

    @Override
    public RemoveCheckIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (RemoveCheckIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public RemoveCheckIn setQuotaUser(java.lang.String quotaUser) {
      return (RemoveCheckIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public RemoveCheckIn setUserIp(java.lang.String userIp) {
      return (RemoveCheckIn) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.Long id;

    /**

     */
    public java.lang.Long getId() {
      return id;
    }

    public RemoveCheckIn setId(java.lang.Long id) {
      this.id = id;
      return this;
    }

    @Override
    public RemoveCheckIn set(String parameterName, Object value) {
      return (RemoveCheckIn) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateCheckIn".
   *
   * This request holds the parameters needed by the checkinendpoint server.  After setting any
   * optional parameters, call the {@link UpdateCheckIn#execute()} method to invoke the remote
   * operation.
   *
   * @param content the {@link com.google.doc_it.checkinendpoint.model.CheckIn}
   * @return the request
   */
  public UpdateCheckIn updateCheckIn(com.google.doc_it.checkinendpoint.model.CheckIn content) throws java.io.IOException {
    UpdateCheckIn result = new UpdateCheckIn(content);
    initialize(result);
    return result;
  }

  public class UpdateCheckIn extends CheckinendpointRequest<com.google.doc_it.checkinendpoint.model.CheckIn> {

    private static final String REST_PATH = "checkin";

    /**
     * Create a request for the method "updateCheckIn".
     *
     * This request holds the parameters needed by the the checkinendpoint server.  After setting any
     * optional parameters, call the {@link UpdateCheckIn#execute()} method to invoke the remote
     * operation. <p> {@link UpdateCheckIn#initialize(com.google.api.client.googleapis.services.Abstra
     * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
     * the constructor. </p>
     *
     * @param content the {@link com.google.doc_it.checkinendpoint.model.CheckIn}
     * @since 1.13
     */
    protected UpdateCheckIn(com.google.doc_it.checkinendpoint.model.CheckIn content) {
      super(Checkinendpoint.this, "PUT", REST_PATH, content, com.google.doc_it.checkinendpoint.model.CheckIn.class);
    }

    @Override
    public UpdateCheckIn setAlt(java.lang.String alt) {
      return (UpdateCheckIn) super.setAlt(alt);
    }

    @Override
    public UpdateCheckIn setFields(java.lang.String fields) {
      return (UpdateCheckIn) super.setFields(fields);
    }

    @Override
    public UpdateCheckIn setKey(java.lang.String key) {
      return (UpdateCheckIn) super.setKey(key);
    }

    @Override
    public UpdateCheckIn setOauthToken(java.lang.String oauthToken) {
      return (UpdateCheckIn) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateCheckIn setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateCheckIn) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateCheckIn setQuotaUser(java.lang.String quotaUser) {
      return (UpdateCheckIn) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateCheckIn setUserIp(java.lang.String userIp) {
      return (UpdateCheckIn) super.setUserIp(userIp);
    }

    @Override
    public UpdateCheckIn set(String parameterName, Object value) {
      return (UpdateCheckIn) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Checkinendpoint}.
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

    /** Builds a new instance of {@link Checkinendpoint}. */
    @Override
    public Checkinendpoint build() {
      return new Checkinendpoint(this);
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
     * Set the {@link CheckinendpointRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCheckinendpointRequestInitializer(
        CheckinendpointRequestInitializer checkinendpointRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(checkinendpointRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
