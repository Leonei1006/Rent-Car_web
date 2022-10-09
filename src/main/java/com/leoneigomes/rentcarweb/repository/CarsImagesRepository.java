package com.leoneigomes.rentcarweb.repository;


import com.leoneigomes.rentcarweb.domain.CarsImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsImagesRepository extends JpaRepository<CarsImages, Long> {
}
