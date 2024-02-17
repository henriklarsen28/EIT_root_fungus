package example.demo.Controller;

import example.demo.DAL.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;


    @GetMapping("/retrieveTempHisotry")
    public List<Double> retrieveTempHistory() {
        return dataRepository.retrieveTempHistory();
    }
}
