package com.leoneigomes.rentcarweb.repository;


import com.leoneigomes.rentcarweb.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecificationsReposository extends JpaRepository<Specification, Long> {
}
