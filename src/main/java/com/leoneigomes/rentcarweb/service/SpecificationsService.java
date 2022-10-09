package com.leoneigomes.rentcarweb.service;

import com.leoneigomes.rentcarweb.domain.Specification;
import com.leoneigomes.rentcarweb.repository.SpecificationsReposository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@Service
public class SpecificationsService implements Serializable {

    @Autowired
    private SpecificationsReposository specificationsReposository;

    public Specification saveSpecification(Specification specification){

        return specificationsReposository.save(specification);
    }

    public Specification updateSpecification(Specification specification, Long id){
        Specification  specificationOld = findByIdSpecification(id);
        specification.setId(specificationOld.getId());
        return specificationsReposository.save(specification);
    }

    public void deleteSpecification(Long id){
        Specification specification = findByIdSpecification(id);
        specificationsReposository.delete(specification);
    }


    public List<Specification> findAllSpecification(){
        return specificationsReposository.findAll();
    }

    public Specification findByIdSpecification(Long id){
        Optional<Specification> specification = specificationsReposository.findById(id);
        return specification.get();
    }

}
