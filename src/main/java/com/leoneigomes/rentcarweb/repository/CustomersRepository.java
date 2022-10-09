package com.leoneigomes.rentcarweb.repository;

import com.leoneigomes.rentcarweb.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CustomersRepository extends JpaRepository<Customers, Long> {

}
