package example.demo.DAL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataRepository {

    @Autowired
    private MongoTemplate db;

    public List<Double> retrieveTempHistory() {
        System.out.println(db.getCollectionNames());
        return null;
    }


}
