package example.demo.APIServices;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lab5e.ApiClient;
import com.lab5e.ApiException;
import com.lab5e.span.CollectionsApi;
import com.lab5e.span.DevicesApi;
import com.lab5e.span.model.*;
import example.demo.Models.Device_Model;
import example.demo.Models.MoistureTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class APIRetrieval {

    @Autowired
    private WeatherService weatherService;

    public List<MoistureTemp> retrieveMoistureAndTemp(long lastMoistureTimestamp, List<Device_Model> devices) {
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
                Device device = dp.getDevice();
                String deviceId = device.getDeviceId();

                byte[] payload = dp.getPayload();

                String payloadString = new String(payload);

                String timestampString = dp.getReceived();
                long timestamp = Long.parseLong(timestampString);

                if (timestamp <= lastMoistureTimestamp) {
                    break;
                }

                System.out.println(payloadString);

                double lat = 0;
                double lon = 0;
                // Find device location
                for (Device_Model dev : devices) {
                    if (dev.getDeviceId().equals(deviceId)) {
                        System.out.println("Device found");
                        lat = dev.getLat();
                        lon = dev.getLon();
                    }
                }

                weatherService.getWindData(lat, lon);
                ObjectMapper mapper = new ObjectMapper();

                MoistureTemp moistureTemp = mapper.readValue(payloadString, MoistureTemp.class);
                moistureTemp.setDeviceId(deviceId);
                moistureTemp.setTimestamp(timestamp);
                moistureTemps.add(moistureTemp);
            }



        }
        catch (ApiException | JsonProcessingException ex) {
            System.out.println("Got exception calling API: code = " + ex);
        }

        return moistureTemps;
    }


    public List<Device_Model> retrieveDevices() {
        final String token = "0a5532bfb7a035c17692dc7285331e932b37fb18bb3793f3bef70898334a0977";

        // Create the API client class and set the API token for it.
        final ApiClient client = new ApiClient();
        client.setApiKey(token);

        // Use the ProfileApi class to retrieve the profile
        final CollectionsApi collApi = new CollectionsApi(client);
        final DevicesApi devApi = new DevicesApi(client);
        // Initiate string
        List<Device_Model> devices = new ArrayList<>();

        try {
            // This will retrieve the profile. If there's an error retrieving
            // the profile an ApiException is thrown.
            ListDevicesResponse data = devApi.listDevices("17kn6b76ejd800");



            // Retrieve the data from the response and build a list of it
            for (Device device : data.getDevices()) {
                String deviceId = device.getDeviceId();

                Device_Model dev = new Device_Model(deviceId, 0, 0);
                devices.add(dev);
            }



        }
        catch (ApiException ex) {
            System.out.println("Got exception calling API: code = " + ex);
        }

        return devices;
    }
}
