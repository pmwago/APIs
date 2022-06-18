package com.example.cars.resource;

import com.example.cars.domain.CarsDomain;

import com.example.cars.service.CarsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class CarsResource {
    private final CarsService carsService;

    public CarsResource(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/findAllCars")
    public List<CarsDomain> findAll(){
        log.debug("REST request to find all cars");
        return carsService.findAll();
    }

    @GetMapping("/findCarById/{id}")
    public CarsDomain findById(@PathVariable String id){
        log.debug("REST request to find car by id : {}", id);
        return carsService.findById(id);
    }

    @PostMapping("/createCar")
    public CarsDomain creatCar(@RequestBody CarsDomain carsDomain){
        log.debug("REST request to create car : {} ", carsDomain);
        return carsService.save(carsDomain);
    }

    @PutMapping("/updateCar/{id}")
    public CarsDomain updateCarById(@RequestBody CarsDomain carsDomain){
        log.debug("REST request to update car  : {}", carsDomain);
        return carsService.updateById(carsDomain);
}

    @DeleteMapping("/deleteCar/{id}")
    public void deleteCarById(@PathVariable String id){
        log.debug("REST request to delete car by id : {}", id);
        carsService.deleteById(id);
    }
}
