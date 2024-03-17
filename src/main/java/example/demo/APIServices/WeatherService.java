package example.demo.APIServices;

import org.json.JSONObject;
import example.demo.Models.WindData;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Instant;
import java.util.List;

@Service
public class WeatherService {

    private HttpClient meteorologicalService = HttpClient.newHttpClient();

    public WindData getWindData(double lat, double lon){
        try {
            String apiUrl = String.format("https://api.met.no/weatherapi/nowcast/2.0/complete?lat=%s&lon=%s", lat, lon);

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(java.net.URI.create(apiUrl))
                    .header("Content-Type", "application/json")
                    .GET()
                    .build();

            HttpResponse<String> response = meteorologicalService.send(request, HttpResponse.BodyHandlers.ofString());

            String responseString = response.body();

            JSONObject json = new JSONObject(responseString);
            JSONObject properties = json.getJSONObject("properties");


            double windSpeed = properties.getJSONArray("timeseries").getJSONObject(0).getJSONObject("data")
                    .getJSONObject("instant").getJSONObject("details").getDouble("wind_speed");
            double windGust = properties.getJSONArray("timeseries").getJSONObject(0).getJSONObject("data")
                    .getJSONObject("instant").getJSONObject("details").getDouble("wind_speed_of_gust");
            String timeString = properties.getJSONArray("timeseries").getJSONObject(0).getString("time");

            Instant time = Instant.parse(timeString);
            long unixTime = time.getEpochSecond();

            // Calculate to k/mh
            windSpeed *= 3.6;
            windGust *= 3.6;

            return new WindData(unixTime, windSpeed, windGust);
        }
        catch (Exception e){
            System.out.println(e);
            Instant time = Instant.now();
            long unixTime = time.getEpochSecond();
            return new WindData(unixTime,0,0);
        }
    }


}
