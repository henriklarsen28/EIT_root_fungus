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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * The output data message contains payload plus metadata for a payload received from a device.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-26T21:32:33.579133Z[Etc/UTC]")
public class OutputDataMessage {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private OutputMessageType type = OutputMessageType.UNKNOWN;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private Device device;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private byte[] payload;

  public static final String SERIALIZED_NAME_RECEIVED = "received";
  @SerializedName(SERIALIZED_NAME_RECEIVED)
  private String received;

  public static final String SERIALIZED_NAME_TRANSPORT = "transport";
  @SerializedName(SERIALIZED_NAME_TRANSPORT)
  private String transport;

  public static final String SERIALIZED_NAME_UDP_META_DATA = "udpMetaData";
  @SerializedName(SERIALIZED_NAME_UDP_META_DATA)
  private UDPMetadata udpMetaData;

  public static final String SERIALIZED_NAME_COAP_META_DATA = "coapMetaData";
  @SerializedName(SERIALIZED_NAME_COAP_META_DATA)
  private CoAPMetadata coapMetaData;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_MQTT_META_DATA = "mqttMetaData";
  @SerializedName(SERIALIZED_NAME_MQTT_META_DATA)
  private MQTTMetadata mqttMetaData;

  public static final String SERIALIZED_NAME_GATEWAY_META_DATA = "gatewayMetaData";
  @SerializedName(SERIALIZED_NAME_GATEWAY_META_DATA)
  private GatewayMetadata gatewayMetaData;

  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public OutputDataMessage() {
  }

  public OutputDataMessage type(OutputMessageType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public OutputMessageType getType() {
    return type;
  }


  public void setType(OutputMessageType type) {
    this.type = type;
  }


  public OutputDataMessage device(Device device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable

  public Device getDevice() {
    return device;
  }


  public void setDevice(Device device) {
    this.device = device;
  }


  public OutputDataMessage payload(byte[] payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable

  public byte[] getPayload() {
    return payload;
  }


  public void setPayload(byte[] payload) {
    this.payload = payload;
  }


  public OutputDataMessage received(String received) {
    
    this.received = received;
    return this;
  }

   /**
   * Received time for message. Value is ms since epoch.
   * @return received
  **/
  @javax.annotation.Nullable

  public String getReceived() {
    return received;
  }


  public void setReceived(String received) {
    this.received = received;
  }


  public OutputDataMessage transport(String transport) {
    
    this.transport = transport;
    return this;
  }

   /**
   * Get transport
   * @return transport
  **/
  @javax.annotation.Nullable

  public String getTransport() {
    return transport;
  }


  public void setTransport(String transport) {
    this.transport = transport;
  }


  public OutputDataMessage udpMetaData(UDPMetadata udpMetaData) {
    
    this.udpMetaData = udpMetaData;
    return this;
  }

   /**
   * Get udpMetaData
   * @return udpMetaData
  **/
  @javax.annotation.Nullable

  public UDPMetadata getUdpMetaData() {
    return udpMetaData;
  }


  public void setUdpMetaData(UDPMetadata udpMetaData) {
    this.udpMetaData = udpMetaData;
  }


  public OutputDataMessage coapMetaData(CoAPMetadata coapMetaData) {
    
    this.coapMetaData = coapMetaData;
    return this;
  }

   /**
   * Get coapMetaData
   * @return coapMetaData
  **/
  @javax.annotation.Nullable

  public CoAPMetadata getCoapMetaData() {
    return coapMetaData;
  }


  public void setCoapMetaData(CoAPMetadata coapMetaData) {
    this.coapMetaData = coapMetaData;
  }


  public OutputDataMessage messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * Get messageId
   * @return messageId
  **/
  @javax.annotation.Nullable

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public OutputDataMessage mqttMetaData(MQTTMetadata mqttMetaData) {
    
    this.mqttMetaData = mqttMetaData;
    return this;
  }

   /**
   * Get mqttMetaData
   * @return mqttMetaData
  **/
  @javax.annotation.Nullable

  public MQTTMetadata getMqttMetaData() {
    return mqttMetaData;
  }


  public void setMqttMetaData(MQTTMetadata mqttMetaData) {
    this.mqttMetaData = mqttMetaData;
  }


  public OutputDataMessage gatewayMetaData(GatewayMetadata gatewayMetaData) {
    
    this.gatewayMetaData = gatewayMetaData;
    return this;
  }

   /**
   * Get gatewayMetaData
   * @return gatewayMetaData
  **/
  @javax.annotation.Nullable

  public GatewayMetadata getGatewayMetaData() {
    return gatewayMetaData;
  }


  public void setGatewayMetaData(GatewayMetadata gatewayMetaData) {
    this.gatewayMetaData = gatewayMetaData;
  }


  public OutputDataMessage gatewayId(String gatewayId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutputDataMessage outputDataMessage = (OutputDataMessage) o;
    return Objects.equals(this.type, outputDataMessage.type) &&
        Objects.equals(this.device, outputDataMessage.device) &&
        Arrays.equals(this.payload, outputDataMessage.payload) &&
        Objects.equals(this.received, outputDataMessage.received) &&
        Objects.equals(this.transport, outputDataMessage.transport) &&
        Objects.equals(this.udpMetaData, outputDataMessage.udpMetaData) &&
        Objects.equals(this.coapMetaData, outputDataMessage.coapMetaData) &&
        Objects.equals(this.messageId, outputDataMessage.messageId) &&
        Objects.equals(this.mqttMetaData, outputDataMessage.mqttMetaData) &&
        Objects.equals(this.gatewayMetaData, outputDataMessage.gatewayMetaData) &&
        Objects.equals(this.gatewayId, outputDataMessage.gatewayId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, device, Arrays.hashCode(payload), received, transport, udpMetaData, coapMetaData, messageId, mqttMetaData, gatewayMetaData, gatewayId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutputDataMessage {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    received: ").append(toIndentedString(received)).append("\n");
    sb.append("    transport: ").append(toIndentedString(transport)).append("\n");
    sb.append("    udpMetaData: ").append(toIndentedString(udpMetaData)).append("\n");
    sb.append("    coapMetaData: ").append(toIndentedString(coapMetaData)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    mqttMetaData: ").append(toIndentedString(mqttMetaData)).append("\n");
    sb.append("    gatewayMetaData: ").append(toIndentedString(gatewayMetaData)).append("\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("device");
    openapiFields.add("payload");
    openapiFields.add("received");
    openapiFields.add("transport");
    openapiFields.add("udpMetaData");
    openapiFields.add("coapMetaData");
    openapiFields.add("messageId");
    openapiFields.add("mqttMetaData");
    openapiFields.add("gatewayMetaData");
    openapiFields.add("gatewayId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OutputDataMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OutputDataMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OutputDataMessage is not found in the empty JSON string", OutputDataMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OutputDataMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OutputDataMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        Device.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
      if ((jsonObj.get("received") != null && !jsonObj.get("received").isJsonNull()) && !jsonObj.get("received").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `received` to be a primitive type in the JSON string but got `%s`", jsonObj.get("received").toString()));
      }
      if ((jsonObj.get("transport") != null && !jsonObj.get("transport").isJsonNull()) && !jsonObj.get("transport").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transport` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transport").toString()));
      }
      // validate the optional field `udpMetaData`
      if (jsonObj.get("udpMetaData") != null && !jsonObj.get("udpMetaData").isJsonNull()) {
        UDPMetadata.validateJsonObject(jsonObj.getAsJsonObject("udpMetaData"));
      }
      // validate the optional field `coapMetaData`
      if (jsonObj.get("coapMetaData") != null && !jsonObj.get("coapMetaData").isJsonNull()) {
        CoAPMetadata.validateJsonObject(jsonObj.getAsJsonObject("coapMetaData"));
      }
      if ((jsonObj.get("messageId") != null && !jsonObj.get("messageId").isJsonNull()) && !jsonObj.get("messageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `messageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("messageId").toString()));
      }
      // validate the optional field `mqttMetaData`
      if (jsonObj.get("mqttMetaData") != null && !jsonObj.get("mqttMetaData").isJsonNull()) {
        MQTTMetadata.validateJsonObject(jsonObj.getAsJsonObject("mqttMetaData"));
      }
      // validate the optional field `gatewayMetaData`
      if (jsonObj.get("gatewayMetaData") != null && !jsonObj.get("gatewayMetaData").isJsonNull()) {
        GatewayMetadata.validateJsonObject(jsonObj.getAsJsonObject("gatewayMetaData"));
      }
      if ((jsonObj.get("gatewayId") != null && !jsonObj.get("gatewayId").isJsonNull()) && !jsonObj.get("gatewayId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gatewayId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gatewayId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OutputDataMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OutputDataMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OutputDataMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OutputDataMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<OutputDataMessage>() {
           @Override
           public void write(JsonWriter out, OutputDataMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OutputDataMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OutputDataMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OutputDataMessage
  * @throws IOException if the JSON string is invalid with respect to OutputDataMessage
  */
  public static OutputDataMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OutputDataMessage.class);
  }

 /**
  * Convert an instance of OutputDataMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

