package example.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoistureTemp {

    private String deviceId;
    @JsonProperty("Moisture")
    private int moisture;
    private int temperature;

    @JsonProperty("received")
    private long timestamp;


    public MoistureTemp(long timestamp,String deviceId, int moisture, int temperature) {
        this.timestamp = timestamp;
        this.deviceId = deviceId;
        this.moisture = moisture;
        this.temperature = temperature;
    }

    public MoistureTemp() {
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public int getMoisture() {
        return moisture;
    }

    public void setMoisture(int moisture) {
        this.moisture = moisture;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "Recieved: "+ timestamp + ", Moisture: " + moisture + ", Temperature: " + temperature;
    }

}
