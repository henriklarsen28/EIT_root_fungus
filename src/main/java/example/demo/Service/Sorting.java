package example.demo.Service;

import example.demo.Models.MoistureTemp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Sorting {

    public void sortAfterDate(List<MoistureTemp> list){
        list.sort((o1, o2) -> comparator(o1, o2));

    }

    public int comparator(MoistureTemp o1, MoistureTemp o2){
        if (o1.getTimestamp() < o2.getTimestamp()) {
            return -1;
        } else if (o1.getTimestamp() > o2.getTimestamp()) {
            return 1;
        } else {
            return 0;
        }
    }
}
