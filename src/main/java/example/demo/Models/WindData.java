package example.demo.Models;

public class WindData {
    private long time;
    private double wind_speed;
    private double wind_speed_gust;

    public WindData(long time, double wind_speed, double wind_speed_gust) {
        this.time = time;
        this.wind_speed = wind_speed;
        this.wind_speed_gust = wind_speed_gust;
    }

    public WindData() {
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
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
}
