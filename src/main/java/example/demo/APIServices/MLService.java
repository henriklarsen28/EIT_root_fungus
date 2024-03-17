package example.demo.APIServices;

import com.google.gson.Gson;
import example.demo.Models.MoistureTemp;
import org.bson.json.JsonObject;
import org.springframework.stereotype.Service;
import org.tensorflow.*;
import org.tensorflow.op.core.Variable;
import org.tensorflow.types.TFloat32;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;


@Service
public class MLService {
    public Double[] predictRotChance(List<MoistureTemp> data) {
        try{
            // Convert the list to a json string
            Gson gson = new Gson();
            String jsonList = gson.toJson(data);

            // Send the json string to the flask server
            String url = "http://localhost:5000/predict";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(java.net.URI.create(url))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonList))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Build a list of doubles from the response
            // Remove the brackets from the string
            String responseString = response.body().replace("[", "").replace("]", "");
            String[] responseArray = responseString.split(",");


            System.out.println(response);
            // Parse from string to double
            Double[] responseArrayDouble = new Double[responseArray.length];

            for (int i = 0; i < responseArray.length; i++) {
                responseArrayDouble[i] = Double.parseDouble(responseArray[i]);
            }

            return responseArrayDouble;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }

    }
}
