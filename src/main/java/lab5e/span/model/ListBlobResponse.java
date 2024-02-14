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
import java.util.*;
import java.util.Map.Entry;

/**
 * Response object when listing blobs for a collection
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-26T21:32:33.579133Z[Etc/UTC]")
public class ListBlobResponse {
  public static final String SERIALIZED_NAME_BLOBS = "blobs";
  @SerializedName(SERIALIZED_NAME_BLOBS)
  private List<Blob> blobs = new ArrayList<>();

  public ListBlobResponse() {
  }

  public ListBlobResponse blobs(List<Blob> blobs) {
    
    this.blobs = blobs;
    return this;
  }

  public ListBlobResponse addBlobsItem(Blob blobsItem) {
    if (this.blobs == null) {
      this.blobs = new ArrayList<>();
    }
    this.blobs.add(blobsItem);
    return this;
  }

   /**
   * Get blobs
   * @return blobs
  **/
  @javax.annotation.Nullable

  public List<Blob> getBlobs() {
    return blobs;
  }


  public void setBlobs(List<Blob> blobs) {
    this.blobs = blobs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBlobResponse listBlobResponse = (ListBlobResponse) o;
    return Objects.equals(this.blobs, listBlobResponse.blobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBlobResponse {\n");
    sb.append("    blobs: ").append(toIndentedString(blobs)).append("\n");
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
    openapiFields.add("blobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ListBlobResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ListBlobResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBlobResponse is not found in the empty JSON string", ListBlobResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ListBlobResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBlobResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("blobs") != null && !jsonObj.get("blobs").isJsonNull()) {
        JsonArray jsonArrayblobs = jsonObj.getAsJsonArray("blobs");
        if (jsonArrayblobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("blobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `blobs` to be an array in the JSON string but got `%s`", jsonObj.get("blobs").toString()));
          }

          // validate the optional field `blobs` (array)
          for (int i = 0; i < jsonArrayblobs.size(); i++) {
            Blob.validateJsonObject(jsonArrayblobs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBlobResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBlobResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBlobResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBlobResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBlobResponse>() {
           @Override
           public void write(JsonWriter out, ListBlobResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBlobResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ListBlobResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ListBlobResponse
  * @throws IOException if the JSON string is invalid with respect to ListBlobResponse
  */
  public static ListBlobResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBlobResponse.class);
  }

 /**
  * Convert an instance of ListBlobResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

