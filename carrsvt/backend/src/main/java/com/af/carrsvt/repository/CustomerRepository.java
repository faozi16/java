package com.af.carrsvt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.af.carrsvt.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
