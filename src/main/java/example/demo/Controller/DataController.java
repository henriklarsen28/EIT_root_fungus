package example.demo.Controller;

import example.demo.DAL.DataRepository;
import example.demo.Models.Device_Model;
import example.demo.Models.MoistureTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;


    @GetMapping("/retrieveTempHistory")
    public List<MoistureTemp> retrieveTempHistory() {
        return dataRepository.retrieveTempHistory();
    }

    @GetMapping("/getDevices")
    public List<Device_Model> getDevices() {
        return dataRepository.getDevices();
    }

    @GetMapping("/saveMoisture")
    public void saveMoistureTemp(){
        dataRepository.saveMoistureTemp();
    }

    @GetMapping("/saveDevices")
    public void saveDevices(){
        dataRepository.saveDevices();
    }

    @PostMapping("/setLocation")
    public Boolean setDeviceLocation(Device_Model device){
        return dataRepository.setDeviceLocation(device);
    }

    @GetMapping("/initDb")
    public void initDb() {
        dataRepository.initDb();
    }
}