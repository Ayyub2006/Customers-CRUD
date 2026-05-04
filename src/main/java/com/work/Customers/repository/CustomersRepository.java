package com.work.Customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.Customers.model.Customers;

@Repository
public interface CustomersRepository extends JpaRepository<Customers, Long>{

}
