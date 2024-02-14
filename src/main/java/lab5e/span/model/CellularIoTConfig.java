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


package lab5e.span.model;

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
 * This is the cellular IOT config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-26T21:32:33.579133Z[Etc/UTC]")
public class CellularIoTConfig {
  public static final String SERIALIZED_NAME_IMSI = "imsi";
  @SerializedName(SERIALIZED_NAME_IMSI)
  private String imsi;

  public static final String SERIALIZED_NAME_IMEI = "imei";
  @SerializedName(SERIALIZED_NAME_IMEI)
  private String imei;

  public CellularIoTConfig() {
  }

  public CellularIoTConfig imsi(String imsi) {
    
    this.imsi = imsi;
    return this;
  }

   /**
   * Get imsi
   * @return imsi
  **/
  @javax.annotation.Nullable

  public String getImsi() {
    return imsi;
  }


  public void setImsi(String imsi) {
    this.imsi = imsi;
  }


  public CellularIoTConfig imei(String imei) {
    
    this.imei = imei;
    return this;
  }

   /**
   * Get imei
   * @return imei
  **/
  @javax.annotation.Nullable

  public String getImei() {
    return imei;
  }


  public void setImei(String imei) {
    this.imei = imei;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellularIoTConfig cellularIoTConfig = (CellularIoTConfig) o;
    return Objects.equals(this.imsi, cellularIoTConfig.imsi) &&
        Objects.equals(this.imei, cellularIoTConfig.imei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imsi, imei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellularIoTConfig {\n");
    sb.append("    imsi: ").append(toIndentedString(imsi)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
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
    openapiFields.add("imsi");
    openapiFields.add("imei");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CellularIoTConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CellularIoTConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CellularIoTConfig is not found in the empty JSON string", CellularIoTConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CellularIoTConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CellularIoTConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("imsi") != null && !jsonObj.get("imsi").isJsonNull()) && !jsonObj.get("imsi").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imsi` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imsi").toString()));
      }
      if ((jsonObj.get("imei") != null && !jsonObj.get("imei").isJsonNull()) && !jsonObj.get("imei").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imei` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imei").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CellularIoTConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CellularIoTConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CellularIoTConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CellularIoTConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<CellularIoTConfig>() {
           @Override
           public void write(JsonWriter out, CellularIoTConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CellularIoTConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CellularIoTConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CellularIoTConfig
  * @throws IOException if the JSON string is invalid with respect to CellularIoTConfig
  */
  public static CellularIoTConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CellularIoTConfig.class);
  }

 /**
  * Convert an instance of CellularIoTConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

