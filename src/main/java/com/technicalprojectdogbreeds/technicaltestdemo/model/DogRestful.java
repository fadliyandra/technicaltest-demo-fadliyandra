package com.technicalprojectdogbreeds.technicaltestdemo.model;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.lang.annotation.Documented;

@Data

public class DogRestful {
    @Id
    public  String id;
    public  String name;

}
