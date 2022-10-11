package com.leoneigomes.rentcarweb.controllers;

import com.leoneigomes.rentcarweb.domain.Brand;
import com.leoneigomes.rentcarweb.domain.Cars;
import com.leoneigomes.rentcarweb.domain.Categories;
import com.leoneigomes.rentcarweb.dto.CarsDTO;
import com.leoneigomes.rentcarweb.service.BrandService;
import com.leoneigomes.rentcarweb.service.CarsService;
import com.leoneigomes.rentcarweb.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsControllers {

    @Autowired
    private CarsService carsService;

    @Autowired
    private BrandService brandService;

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping
    public List<Cars> getAllCars(){
        return carsService.findAllCars();
    }
    @PostMapping
    public ResponseEntity<Object>  carsSave(@RequestBody CarsDTO carsDTO){
        Categories categories = categoriesService.findByIdCategories(carsDTO.getCategory_id());
        Brand brand = brandService.findByIdBrand(carsDTO.getBrand_id());
        Cars cars = new Cars(carsDTO.getName(), carsDTO.getDescription(), carsDTO.getDaily_rate(), carsDTO.isAvaliable(), brand,
                categories, carsDTO.getColor(), carsDTO.getLicense_plate());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(carsService.saveCars(cars));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cars> getCarsById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(carsService.findByIdCars(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Cars> deleteCars(@PathVariable Long id){
        carsService.deleteCars(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}

