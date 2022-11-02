package com.technicalprojectdogbreeds.technicaltestdemo.service;

import com.technicalprojectdogbreeds.technicaltestdemo.model.DogRestful;

import java.util.List;

public interface DogRestfulService {
    DogRestful create(DogRestful dogRestful);
    List<DogRestful> findAll();
    DogRestful findById(String id);
    DogRestful update(String id, DogRestful dogRestful);
    void delete(String id);

}
