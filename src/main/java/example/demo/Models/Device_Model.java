package example.demo.Models;

public class Device_Model {
    private String deviceId;
    private double lat;
    private double lon;

    public Device_Model(String deviceId, double lat, double lon) {
        this.deviceId = deviceId;
        this.lat = lat;
        this.lon = lon;
    }

    public Device_Model() {
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}


