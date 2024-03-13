package example.demo.Models;

public class WindData {
    private String time;
    private double direction;
    private double wind_speed;
    private double wind_speed_gust;

    public WindData(String time, double direction, double wind_speed, double wind_speed_gust) {
        this.time = time;
        this.direction = direction;
        this.wind_speed = wind_speed;
        this.wind_speed_gust = wind_speed_gust;
    }

    public WindData() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
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
