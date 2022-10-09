package com.leoneigomes.rentcarweb.repository;

import com.leoneigomes.rentcarweb.domain.Rentals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RentalsRepository extends JpaRepository <Rentals, Long>{

}
