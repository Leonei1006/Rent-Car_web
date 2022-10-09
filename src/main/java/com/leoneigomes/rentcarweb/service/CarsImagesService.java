package com.leoneigomes.rentcarweb.service;


import com.leoneigomes.rentcarweb.domain.CarsImages;
import com.leoneigomes.rentcarweb.repository.CarsImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class CarsImagesService implements Serializable {


    @Autowired
    private CarsImagesRepository carsImagesRepository;

    public CarsImages saveCarsImages(CarsImages carsImages){

        return carsImagesRepository.save(carsImages);
    }


    public CarsImages updateCarsImages(CarsImages carsImages, Long id){
        CarsImages  carsImagesOld = findByIdCarsImages(id);
        carsImages.setId(carsImagesOld.getId());
        return carsImagesRepository.save(carsImages);
    }

    public void deleteCarsImages(Long id){
        CarsImages carsImages = findByIdCarsImages(id);
        carsImagesRepository.delete(carsImages);
    }


    public List<CarsImages> findAllCarsImages(){

        return carsImagesRepository.findAll();
    }

    public CarsImages findByIdCarsImages(Long id){
        Optional<CarsImages> carsImages = carsImagesRepository.findById(id);
        return carsImages.get();
    }
}
