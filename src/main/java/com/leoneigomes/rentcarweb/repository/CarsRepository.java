package com.leoneigomes.rentcarweb.repository;

import com.leoneigomes.rentcarweb.domain.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {



    }
