package com.leoneigomes.rentcarweb.service;


import com.leoneigomes.rentcarweb.domain.Rentals;
import com.leoneigomes.rentcarweb.repository.RentalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public class RentalsService implements Serializable {

    @Autowired
    private RentalsRepository rentalsRepository;

    public Rentals saveCustomers(Rentals rentals){
        return rentalsRepository.save(rentals);
    }
    public Rentals updateCustomers(Rentals rentals, Long id){
        Rentals  rentalsOld = findByIdRentals(id);
        rentals.setId(rentalsOld.getId());
        return rentalsRepository.save(rentals);
    }

    public void deleteRentals(Long id){
        Rentals rentals = findByIdRentals(id);
        rentalsRepository.delete(rentals);
    }


    public List<Rentals> findAllRentals(){
        return rentalsRepository.findAll();
    }

    public Rentals findByIdRentals(Long id){
        Optional<Rentals> rentals = rentalsRepository.findById(id);
        return rentals.get();
    }
}
