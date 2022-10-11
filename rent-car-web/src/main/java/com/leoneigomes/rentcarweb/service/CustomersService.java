package com.leoneigomes.rentcarweb.service;


import com.leoneigomes.rentcarweb.domain.Customers;
import com.leoneigomes.rentcarweb.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class CustomersService implements Serializable {

    @Autowired
    private CustomersRepository customersRepository;

    public Customers saveCustomers(Customers customers){
        return customersRepository.save(customers);
    }
    public Customers updateCustomers(Customers customers, Long id){
        Customers  customersOld = findByIdCustomers(id);
        customers.setId(customersOld.getId());
        return customersRepository.save(customers);
    }

    public void deleteCustomers(Long id){
        Customers customers = findByIdCustomers(id);
        customersRepository.delete(customers);
    }


    public List<Customers> findAllCustomers(){
        return customersRepository.findAll();
    }

    public Customers findByIdCustomers(Long id){
        Optional<Customers> customers = customersRepository.findById(id);
        return customers.get();
    }
}
