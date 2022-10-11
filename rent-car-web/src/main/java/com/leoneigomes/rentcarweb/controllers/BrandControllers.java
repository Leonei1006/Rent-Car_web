package com.leoneigomes.rentcarweb.controllers;

import com.leoneigomes.rentcarweb.domain.Brand;
import com.leoneigomes.rentcarweb.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandControllers {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public List<Brand> getAllBrand(){
        return brandService.findAllBrand();
    }
    @PostMapping
    public ResponseEntity<Object> brandSave(@RequestBody Brand brand){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(brandService.saveBrand(brand));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Brand> getBarandById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(brandService.findByIdBrand(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Brand> deleteBrand(@PathVariable Long id){
        brandService.deleteBrand(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
