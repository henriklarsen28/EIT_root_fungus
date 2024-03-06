package example.demo.Service;

import example.demo.Models.Device_Model;
import example.demo.Models.MoistureTemp;
import org.bson.Document;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Mapping {

    public List<Document> parseFromMoistureTempToDocumentList(List<MoistureTemp> data){
        List<Document> docs = new ArrayList<Document>();

        for (MoistureTemp temp : data) {
            Document doc = new Document()
                    .append("DeviceID", temp.getDeviceId())
                    .append("Timestamp", temp.getTimestamp())
                    .append("Moisture", temp.getMoisture())
                    .append("Temp", temp.getTemperature());
            docs.add(doc);
        }
        return docs;

    }

    public MoistureTemp mapToMoistureTemp(Document doc){
        MoistureTemp temp = new MoistureTemp(doc.getLong("Timestamp"),doc.getString("DeviceID"),doc.getInteger("Moisture"),doc.getInteger("Temp"));
        return temp;
    }

    public Document parseFromDeviceToDocument(Device_Model device){
        Document doc = new Document()
                .append("DeviceID", device.getDeviceId())
                .append("Lat", device.getLat())
                .append("Lon", device.getLon());
        return doc;
    }

    public Device_Model mapToDevice(Document doc){
        Device_Model device = new Device_Model(doc.getString("DeviceID"),doc.getDouble("Lat"),doc.getDouble("Lon"));
        return device;
    }
}
