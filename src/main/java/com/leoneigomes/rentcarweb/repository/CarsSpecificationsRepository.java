package com.leoneigomes.rentcarweb.repository;


import com.leoneigomes.rentcarweb.domain.CarsSpecifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarsSpecificationsRepository extends JpaRepository<CarsSpecifications, Long> {
}
