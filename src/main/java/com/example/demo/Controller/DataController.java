package com.example.demo.Controller;

import com.example.demo.DAL.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

}
