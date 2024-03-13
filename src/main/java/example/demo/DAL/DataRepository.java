package example.demo.DAL;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import example.demo.APIServices.APIRetrieval;
import example.demo.Models.Device_Model;
import example.demo.Models.MoistureTemp;
import example.demo.Service.Mapping;
import example.demo.Service.Sorting;
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

    @Autowired
    private Sorting sorting;

    @Autowired
    private Mapping mapping;

    public List<MoistureTemp> retrieveTempHistory() {
        //saveMoistureTemp();
        MongoCollection<Document> collection = db.getCollection("MoistureTemp");
        FindIterable docs = collection.find();
        List<MoistureTemp> moistureTemps = new ArrayList<>();
        MongoCursor<Document> cursor = docs.iterator();

        while(cursor.hasNext()){
            Document doc = cursor.next();
            MoistureTemp temp = mapping.mapToMoistureTemp(doc);
            moistureTemps.add(temp);
        }

        return moistureTemps;
    }



    public List<Device_Model> getDevices() {
        MongoCollection<Document> collection = db.getCollection("Device");
        FindIterable docs = collection.find();
        List<Device_Model> devices = new ArrayList<>();
        MongoCursor<Document> cursor = docs.iterator();

        while(cursor.hasNext()){
            Document doc = cursor.next();
            Device_Model device = mapping.mapToDevice(doc);
            devices.add(device);
        }

        return devices;
    }

    public Device_Model getDevice(String deviceId) {
        try {
            MongoCollection<Document> collection = db.getCollection("Device");
            Document doc = collection.find(new Document("DeviceID", deviceId)).first();
            return mapping.mapToDevice(doc);
        }
        catch (Exception e){
            System.out.println("Error in getDevice: " + e);
            return null;
        }
    }

    public Boolean setDeviceLocation(Device_Model device) {
        try {
            MongoCollection<Document> collection = db.getCollection("Device");

            Document doc = mapping.parseFromDeviceToDocument(device);
            collection.insertOne(doc);
            return true;
        }
        catch (Exception e){
            System.out.println("Error in setDeviceLocation: " + e);
            return false;
        }
    }


    public void saveMoistureTemp(){
        try {
            // Gets the data already in the database to not duplicate data
            List<MoistureTemp> previousDataList = retrieveTempHistory();
            // Sort after date to get the newest at the front
            sorting.sortAfterDate(previousDataList);

            // Get the newest timestamp
            if (previousDataList.size() == 0) {
                previousDataList.add(new MoistureTemp(0, "0", 0, 0));
            }
            long timestampPreviousData = previousDataList.get(0).getTimestamp();


            List<MoistureTemp> data = apiRetrieval.retrieveMoistureAndTemp(timestampPreviousData, getDevices());

            MongoCollection<Document> collection = db.getCollection("MoistureTemp");

            // Parse the data to documents and insert
            List<Document> docs = mapping.parseFromMoistureTempToDocumentList(data);
            collection.insertMany(docs);
        }
        catch (Exception e){
            System.out.println("Error in saveMoistureTemp: " + e);
        }
    }

    public void saveDevices(){
        try {
            List<Device_Model> devices = apiRetrieval.retrieveDevices();
            MongoCollection<Document> collection = db.getCollection("Device");

            // Parse the data to documents and insert
            List<Document> docs = new ArrayList<>();
            for (Device_Model device : devices) {
                docs.add(mapping.parseFromDeviceToDocument(device));
            }
            collection.insertMany(docs);
        }
        catch (Exception e){
            System.out.println("Error in saveDevices: " + e);
        }
    }


    public void initDb(){
        db.dropCollection("MoistureTemp");
        db.dropCollection("Device");
        db.createCollection("MoistureTemp");
        db.createCollection("Device");
    }


}
