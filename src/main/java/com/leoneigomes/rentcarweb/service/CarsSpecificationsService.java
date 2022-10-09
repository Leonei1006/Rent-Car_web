package com.leoneigomes.rentcarweb.service;

import com.leoneigomes.rentcarweb.domain.CarsSpecifications;
import com.leoneigomes.rentcarweb.repository.CarsSpecificationsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class CarsSpecificationsService implements Serializable {

    @Autowired
    private CarsSpecificationsRepository carsSpecificationsRepository;

    public CarsSpecifications saveCarsSpecifications(CarsSpecifications carsSpecifications){
        return carsSpecificationsRepository.save(carsSpecifications);
    }

    public CarsSpecifications updateCarsSpecifications(CarsSpecifications carsSpecifications, Long id){
        CarsSpecifications  carsSpecificationsOld = findByIdCarsSpecifications(id);
        carsSpecifications.setId(carsSpecificationsOld.getId());
        return carsSpecificationsRepository.save(carsSpecifications);
    }

    public void deleteCarsSpecifications(Long id){
        CarsSpecifications carsSpecifications = findByIdCarsSpecifications(id);
        carsSpecificationsRepository.delete(carsSpecifications);
    }


    public List<CarsSpecifications> findAllCarsSpecifications(){
        return carsSpecificationsRepository.findAll();
    }

    public CarsSpecifications findByIdCarsSpecifications(Long id){
        Optional<CarsSpecifications> carsSpecifications = carsSpecificationsRepository.findById(id);
        return carsSpecifications.get();
    }

}
