package com.leoneigomes.rentcarweb.controllers;

import com.leoneigomes.rentcarweb.domain.Cars;
import com.leoneigomes.rentcarweb.service.CarsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
public class CarsControllers {

   final CarsService carsService;

    public CarsControllers(CarsService carsService) {
        this.carsService = carsService;
    }

    @PostMapping
    public ResponseEntity<Object>  carsSave(@RequestBody @Valid Cars cars){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(carsService.saveCars(cars));
    }
}

