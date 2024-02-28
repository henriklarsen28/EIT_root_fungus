package example.demo.Controller;

import com.lab5e.span.model.Collection;
import com.lab5e.span.model.ListDataResponse;
import example.demo.DAL.DataRepository;
import example.demo.Models.Device;
import example.demo.Models.MoistureTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Device> getDevices() {
        return dataRepository.getDevices();
    }

    @GetMapping("/saveMoisture")
    public void saveMoistureTemp(){
        dataRepository.saveMoistureTemp();
    }

    @GetMapping("/initDb")
    public void initDb() {
        dataRepository.initDb();
    }
}
