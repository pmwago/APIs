package com.example.cars.repository;

import com.example.cars.domain.CarsDomain;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CarsRepository {

    List<CarsDomain> cars = new ArrayList<CarsDomain>();

    //Constructor to contain the already filed cars as the data source. Can be removed and create your own using API call.
    public CarsRepository(){
        CarsDomain car1 = new CarsDomain("1", "Toyota", "123", "MarkX", "2022", "2022");
        CarsDomain car2 = new CarsDomain("2", "Toyota", "123", "MarkX", "2022", "2022");
        CarsDomain car3 = new CarsDomain("3", "Toyota", "123", "MarkX", "2022", "2022");
        CarsDomain car4 = new CarsDomain("4", "Toyota", "123", "MarkX", "2022", "2022");
        CarsDomain car5 = new CarsDomain("5", "Toyota", "123", "MarkX", "2022", "2022");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

    }

public CarsDomain save(CarsDomain carsDomain){
    cars.add(carsDomain);
    return carsDomain;
}

public List<CarsDomain> findAll(){
    return cars;
}

public CarsDomain findById(String id){
    CarsDomain car = null;
    for(CarsDomain c: cars){
        if (Objects.equals(c.getId(), id)){
            car=c;
            break;
        }
    }
    return car;
}

    public CarsDomain updateById(CarsDomain carsDomain){
        for(CarsDomain c: cars){
            if (Objects.equals(c.getId(), carsDomain.getId())){
               cars.remove(c);
                break;
            }
        }
        cars.add(carsDomain);
        return carsDomain;
    }

    public void deleteById(String id){
       // CarsDomain car= cars.stream().filter(c -> c.getId() == id).findAny().get();
        //Alternatively
        CarsDomain car = null;
        for(CarsDomain c: cars){
            if (Objects.equals(c.getId(), id)){
                car = c;
                break;
            }
        }
        cars.remove(car);
    }
}