package com.leoneigomes.rentcarweb.service;

import com.leoneigomes.rentcarweb.domain.Brand;
import com.leoneigomes.rentcarweb.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class BrandService implements Serializable {

    @Autowired
    private BrandRepository brandRepository;

    public Brand saveBrand(Brand brand){
        return brandRepository.save(brand);
    }

    public void deleteBrand(Long id){
        Brand brand = findByIdBrand(id);
        brandRepository.delete(brand);
    }


    public List<Brand> findAllBrand(){
        return brandRepository.findAll();
    }

    public Brand findByIdBrand(Long id){
        Optional<Brand> brand = brandRepository.findById(id);
        return brand.get();
    }
}
