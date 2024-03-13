package example.demo.APIServices;

import example.demo.Models.WindData;
import org.springframework.stereotype.Service;

import java.net.http.HttpClient;
import java.util.List;

@Service
public class WeatherService {

    private HttpClient meteorologicalService = HttpClient.newHttpClient();

    public List<WindData> getWindData(double lat, double lon){
        String apiUrl = String.format("https://api.met.no/weatherapi/nowcast/2.0/complete?lat=%s&lon=%s", lat,lon);

        System.out.println(apiUrl);
        return null;
    }


}
