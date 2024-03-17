package example.demo.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MoistureTemp {

    private String deviceId;
    @JsonProperty("Moisture")
    private int moisture;

    @JsonProperty("Humidity")
    private int humidity;

    @JsonProperty("Temperature")
    private int temperature;

    @JsonProperty("received")
    private long timestamp;

    private double wind_speed;
    private double wind_speed_gust;


    public MoistureTemp(long timestamp,String deviceId, int moisture, int temperature, int humidity, double wind_speed, double wind_speed_gust) {
        this.timestamp = timestamp;
        this.deviceId = deviceId;
        this.moisture = moisture;
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind_speed = wind_speed;
        this.wind_speed_gust = wind_speed_gust;

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

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public double getWind_speed_gust() {
        return wind_speed_gust;
    }

    public void setWind_speed_gust(double wind_speed_gust) {
        this.wind_speed_gust = wind_speed_gust;
    }

    public String toString() {
        return "Recieved: "+ timestamp + ", Moisture: " + moisture + ", Temperature: " + temperature;
    }

}
