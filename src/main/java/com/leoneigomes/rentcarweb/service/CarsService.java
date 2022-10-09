package com.leoneigomes.rentcarweb.service;


import com.leoneigomes.rentcarweb.domain.Cars;
import com.leoneigomes.rentcarweb.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class CarsService implements Serializable {

    @Autowired
    private CarsRepository carsRepository;

    public Cars saveCars(Cars cars){
        return carsRepository.save(cars);
    }

    public Cars updateCars(Cars cars, Long id){
        Cars  carsOld = findByIdCars(id);
        cars.setId(carsOld.getId());
        return carsRepository.save(cars);
    }

    public void deleteCars(Long id){
        Cars cars = findByIdCars(id);
        carsRepository.delete(cars);
    }


    public List<Cars> findAllCars(){
        return carsRepository.findAll();
    }

    public Cars findByIdCars(Long id){
        Optional<Cars> cars = carsRepository.findById(id);
        return cars.get();
    }

}
