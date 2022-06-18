package com.example.cars.service;

import com.example.cars.domain.CarsDomain;
import com.example.cars.repository.CarsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CarsService {
   private final CarsRepository carsRepository;

    public CarsService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

//Create a car
    public CarsDomain save(CarsDomain carsDomain){
        log.debug("Request to create car : {}", carsDomain);
        return carsRepository.save(carsDomain);
    }

    public List<CarsDomain> findAll(){
        log.debug("Request to find all cars");
        return carsRepository.findAll();
    }

    public CarsDomain findById(String id){
        log.debug("Request to find car by id : {}", id);
        return carsRepository.findById(id);
    }

    public CarsDomain updateById(CarsDomain carsDomain){
        log.debug("Request to update car : {}", carsDomain);
        return carsRepository.updateById(carsDomain);
    }

    public void deleteById(String id){
        log.debug("Request to delete car of us : {}", id);
        carsRepository.deleteById(id);
    }


}
