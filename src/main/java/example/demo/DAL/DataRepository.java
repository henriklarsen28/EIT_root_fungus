package example.demo.DAL;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import example.demo.APIServices.APIRetrieval;
import example.demo.Models.Device;
import example.demo.Models.MoistureTemp;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class DataRepository {

    @Autowired
    private MongoTemplate db;

    @Autowired
    private APIRetrieval apiRetrieval;

    public List<MoistureTemp> retrieveTempHistory() {
        //saveMoistureTemp();
        MongoCollection<Document> collection = db.getCollection("MoistureTemp");
        FindIterable docs = collection.find();
        List<MoistureTemp> moistureTemps = new ArrayList<>();
        MongoCursor<Document> cursor = docs.iterator();

        while(cursor.hasNext()){
            Document doc = cursor.next();
            MoistureTemp temp = mapToMoistureTemp(doc);
            moistureTemps.add(temp);
        }


        return moistureTemps;
    }

    public MoistureTemp mapToMoistureTemp(Document doc){
        MoistureTemp temp = new MoistureTemp(doc.getString("Timestamp"),doc.getString("DeviceID"),doc.getInteger("Moisture"),doc.getInteger("Temp"));
        return temp;
    }

    public List<Device> getDevices() {
        return db.findAll(Device.class);
    }

    public Device getDevice(String deviceId) {
        return db.findById(deviceId, Device.class);
    }

    public void saveMoistureTemp(){
        List<MoistureTemp> data = apiRetrieval.retrieveMoistureAndTemp();
        MongoCollection<Document> collection = db.getCollection("MoistureTemp");
        List<Document> docs = new ArrayList<Document>();

        for(MoistureTemp temp : data){
            Document doc = new Document()
                    .append("Timestamp", temp.getTimestamp())
                    .append("Moisture", temp.getMoisture())
                    .append("Temp", temp.getTemperature());
            docs.add(doc);
        }

        collection.insertMany(docs);
    }


    public void initDb(){
        db.dropCollection("MoistureTemp");
        db.dropCollection("Device");
        db.createCollection("MoistureTemp");
        db.createCollection("Device");
    }


}
