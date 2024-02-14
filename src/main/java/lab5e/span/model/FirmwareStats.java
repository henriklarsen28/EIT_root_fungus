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
 * Statistics for a single firmware image
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-26T21:32:33.579133Z[Etc/UTC]")
public class FirmwareStats {
  public static final String SERIALIZED_NAME_FIRMWARE_IMAGE_SIZE = "firmwareImageSize";
  @SerializedName(SERIALIZED_NAME_FIRMWARE_IMAGE_SIZE)
  private Integer firmwareImageSize;

  public FirmwareStats() {
  }

  public FirmwareStats firmwareImageSize(Integer firmwareImageSize) {
    
    this.firmwareImageSize = firmwareImageSize;
    return this;
  }

   /**
   * Get firmwareImageSize
   * @return firmwareImageSize
  **/
  @javax.annotation.Nullable

  public Integer getFirmwareImageSize() {
    return firmwareImageSize;
  }


  public void setFirmwareImageSize(Integer firmwareImageSize) {
    this.firmwareImageSize = firmwareImageSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareStats firmwareStats = (FirmwareStats) o;
    return Objects.equals(this.firmwareImageSize, firmwareStats.firmwareImageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firmwareImageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareStats {\n");
    sb.append("    firmwareImageSize: ").append(toIndentedString(firmwareImageSize)).append("\n");
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
    openapiFields.add("firmwareImageSize");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FirmwareStats
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FirmwareStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FirmwareStats is not found in the empty JSON string", FirmwareStats.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FirmwareStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FirmwareStats` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FirmwareStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FirmwareStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FirmwareStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FirmwareStats.class));

       return (TypeAdapter<T>) new TypeAdapter<FirmwareStats>() {
           @Override
           public void write(JsonWriter out, FirmwareStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FirmwareStats read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FirmwareStats given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FirmwareStats
  * @throws IOException if the JSON string is invalid with respect to FirmwareStats
  */
  public static FirmwareStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FirmwareStats.class);
  }

 /**
  * Convert an instance of FirmwareStats to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

