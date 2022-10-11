package com.leoneigomes.rentcarweb.controllers;



import com.leoneigomes.rentcarweb.domain.Categories;
import com.leoneigomes.rentcarweb.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesControllers {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping
    public List<Categories> getAllCategories(){
        return categoriesService.findAllCategories();
    }
    @PostMapping
    public ResponseEntity<Object> categoriesSave(@RequestBody Categories categories){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(categoriesService.saveCategories(categories));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categories> getCategoriesById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(categoriesService.findByIdCategories(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Categories> deleteCategories(@PathVariable Long id){
        categoriesService.deleteCategories(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
