package com.leoneigomes.rentcarweb.service;

import com.leoneigomes.rentcarweb.domain.Categories;
import com.leoneigomes.rentcarweb.repository.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriesService implements Serializable {


    @Autowired
    private CategoriesRepository categoriesRepository;

    public Categories saveCategories(Categories categories){
        return categoriesRepository.save(categories);
    }

    public void deleteCategories(Long id){
        Categories categories = findByIdCategories(id);
        categoriesRepository.delete(categories);
    }


    public List<Categories> findAllCategories(){
        return categoriesRepository.findAll();
    }

    public Categories findByIdCategories(Long id){
        Optional<Categories> categories = categoriesRepository.findById(id);
        return categories.get();
    }
}
