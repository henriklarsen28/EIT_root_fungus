/*
 * The Span API
 * API for device, collection, output and firmware management
 *
 * The version of the OpenAPI document: 4.8.0 indecipherable-ferman
 * Contact: dev@lab5e.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.lab5e.span.model;

import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.lab5e.JSON;

import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * Metadata for devices connected via the internet gateway. This metadata shows the configuration for the last message transmission.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-26T21:32:33.579133Z[Etc/UTC]")
public class InetMetadata {
  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private String lastUpdate;

  public static final String SERIALIZED_NAME_REMOTE_ADDRESS = "remoteAddress";
  @SerializedName(SERIALIZED_NAME_REMOTE_ADDRESS)
  private String remoteAddress;

  public static final String SERIALIZED_NAME_CERTIFICATE_SERIAL = "certificateSerial";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_SERIAL)
  private String certificateSerial;

  public InetMetadata() {
  }

  public InetMetadata gatewayId(String gatewayId) {
    
    this.gatewayId = gatewayId;
    return this;
  }

   /**
   * Get gatewayId
   * @return gatewayId
  **/
  @javax.annotation.Nullable

  public String getGatewayId() {
    return gatewayId;
  }


  public void setGatewayId(String gatewayId) {
    this.gatewayId = gatewayId;
  }


  public InetMetadata lastUpdate(String lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * Get lastUpdate
   * @return lastUpdate
  **/
  @javax.annotation.Nullable

  public String getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(String lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  public InetMetadata remoteAddress(String remoteAddress) {
    
    this.remoteAddress = remoteAddress;
    return this;
  }

   /**
   * Get remoteAddress
   * @return remoteAddress
  **/
  @javax.annotation.Nullable

  public String getRemoteAddress() {
    return remoteAddress;
  }


  public void setRemoteAddress(String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }


  public InetMetadata certificateSerial(String certificateSerial) {
    
    this.certificateSerial = certificateSerial;
    return this;
  }

   /**
   * Get certificateSerial
   * @return certificateSerial
  **/
  @javax.annotation.Nullable

  public String getCertificateSerial() {
    return certificateSerial;
  }


  public void setCertificateSerial(String certificateSerial) {
    this.certificateSerial = certificateSerial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InetMetadata inetMetadata = (InetMetadata) o;
    return Objects.equals(this.gatewayId, inetMetadata.gatewayId) &&
        Objects.equals(this.lastUpdate, inetMetadata.lastUpdate) &&
        Objects.equals(this.remoteAddress, inetMetadata.remoteAddress) &&
        Objects.equals(this.certificateSerial, inetMetadata.certificateSerial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gatewayId, lastUpdate, remoteAddress, certificateSerial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InetMetadata {\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    remoteAddress: ").append(toIndentedString(remoteAddress)).append("\n");
    sb.append("    certificateSerial: ").append(toIndentedString(certificateSerial)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("gatewayId");
    openapiFields.add("lastUpdate");
    openapiFields.add("remoteAddress");
    openapiFields.add("certificateSerial");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InetMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InetMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InetMetadata is not found in the empty JSON string", InetMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InetMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InetMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("gatewayId") != null && !jsonObj.get("gatewayId").isJsonNull()) && !jsonObj.get("gatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayId").toString()));
      }
      if ((jsonObj.get("lastUpdate") != null && !jsonObj.get("lastUpdate").isJsonNull()) && !jsonObj.get("lastUpdate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastUpdate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastUpdate").toString()));
      }
      if ((jsonObj.get("remoteAddress") != null && !jsonObj.get("remoteAddress").isJsonNull()) && !jsonObj.get("remoteAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remoteAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remoteAddress").toString()));
      }
      if ((jsonObj.get("certificateSerial") != null && !jsonObj.get("certificateSerial").isJsonNull()) && !jsonObj.get("certificateSerial").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `certificateSerial` to be a primitive type in the JSON string but got `%s`", jsonObj.get("certificateSerial").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InetMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InetMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InetMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InetMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<InetMetadata>() {
           @Override
           public void write(JsonWriter out, InetMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InetMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InetMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InetMetadata
  * @throws IOException if the JSON string is invalid with respect to InetMetadata
  */
  public static InetMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InetMetadata.class);
  }

 /**
  * Convert an instance of InetMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

