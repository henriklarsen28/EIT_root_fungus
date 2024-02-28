package example.demo.APIServices;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.span.CollectionsApi;
import com.lab5e.span.model.*;
import example.demo.Models.MoistureTemp;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class APIRetrieval {

    public List<MoistureTemp> retrieveAllMoistureAndTemp(){
        final String token = "0a5532bfb7a035c17692dc7285331e932b37fb18bb3793f3bef70898334a0977";

        // Create the API client class and set the API token for it.
        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        // Use the ProfileApi class to retrieve the profile
        final CollectionsApi collApi = new CollectionsApi(client);

        // Initiate string
        List<MoistureTemp> moistureTemps = new ArrayList<>();

        try {
            // This will retrieve the profile. If there's an error retrieving
            // the profile an ApiException is thrown.
            ListDataResponse data = collApi.listCollectionData("17kn6b76ejd800", 100, null,  "0", null);



            // Retrieve the data from the response and build a list of it
            for (OutputDataMessage dp : data.getData()) {
                byte[] payload = dp.getPayload();
                String payloadString = new String(payload);


                ObjectMapper mapper = new ObjectMapper();

                MoistureTemp moistureTemp = mapper.readValue(payloadString, MoistureTemp.class);
                moistureTemps.add(moistureTemp);
            }



        } catch (ApiException | JsonProcessingException ex) {
            System.out.println("Got exception calling API: code = " + ex);
        }


        return moistureTemps;
    }

    public List<MoistureTemp> retrieveMoistureAndTemp() {
        final String token = "0a5532bfb7a035c17692dc7285331e932b37fb18bb3793f3bef70898334a0977";

        // Create the API client class and set the API token for it.
        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        // Use the ProfileApi class to retrieve the profile
        final CollectionsApi collApi = new CollectionsApi(client);

        // Initiate string
        List<MoistureTemp> moistureTemps = new ArrayList<>();

        try {
            // This will retrieve the profile. If there's an error retrieving
            // the profile an ApiException is thrown.
            ListDataResponse data = collApi.listCollectionData("17kn6b76ejd800", 100, null,  "0", null);



            // Retrieve the data from the response and build a list of it
            for (OutputDataMessage dp : data.getData()) {
                byte[] payload = dp.getPayload();
                String timestampString = dp.getReceived();
                String payloadString = new String(payload);
                System.out.println(payloadString);

                ObjectMapper mapper = new ObjectMapper();

                MoistureTemp moistureTemp = mapper.readValue(payloadString, MoistureTemp.class);
                moistureTemp.setTimestamp(timestampString);
                moistureTemps.add(moistureTemp);
            }



        } catch (ApiException | JsonProcessingException ex) {
            System.out.println("Got exception calling API: code = " + ex);
        }

        System.out.println(moistureTemps);
        return moistureTemps;
    }
}
