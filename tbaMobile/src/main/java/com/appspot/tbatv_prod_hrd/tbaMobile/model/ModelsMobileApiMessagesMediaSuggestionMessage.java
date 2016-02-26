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

package com.appspot.tbatv_prod_hrd.tbaMobile.model;

/**
 * Model definition for ModelsMobileApiMessagesMediaSuggestionMessage.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the tbaMobile. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ModelsMobileApiMessagesMediaSuggestionMessage extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("details_json")
  private java.lang.String detailsJson;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("media_url")
  private java.lang.String mediaUrl;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("reference_key")
  private java.lang.String referenceKey;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("reference_type")
  private java.lang.String referenceType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long year;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailsJson() {
    return detailsJson;
  }

  /**
   * @param detailsJson detailsJson or {@code null} for none
   */
  public ModelsMobileApiMessagesMediaSuggestionMessage setDetailsJson(java.lang.String detailsJson) {
    this.detailsJson = detailsJson;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMediaUrl() {
    return mediaUrl;
  }

  /**
   * @param mediaUrl mediaUrl or {@code null} for none
   */
  public ModelsMobileApiMessagesMediaSuggestionMessage setMediaUrl(java.lang.String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceKey() {
    return referenceKey;
  }

  /**
   * @param referenceKey referenceKey or {@code null} for none
   */
  public ModelsMobileApiMessagesMediaSuggestionMessage setReferenceKey(java.lang.String referenceKey) {
    this.referenceKey = referenceKey;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getReferenceType() {
    return referenceType;
  }

  /**
   * @param referenceType referenceType or {@code null} for none
   */
  public ModelsMobileApiMessagesMediaSuggestionMessage setReferenceType(java.lang.String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getYear() {
    return year;
  }

  /**
   * @param year year or {@code null} for none
   */
  public ModelsMobileApiMessagesMediaSuggestionMessage setYear(java.lang.Long year) {
    this.year = year;
    return this;
  }

  @Override
  public ModelsMobileApiMessagesMediaSuggestionMessage set(String fieldName, Object value) {
    return (ModelsMobileApiMessagesMediaSuggestionMessage) super.set(fieldName, value);
  }

  @Override
  public ModelsMobileApiMessagesMediaSuggestionMessage clone() {
    return (ModelsMobileApiMessagesMediaSuggestionMessage) super.clone();
  }

}
