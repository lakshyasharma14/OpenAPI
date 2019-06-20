package com.lakshya.OpenAPI.repositories;

import com.lakshya.OpenAPI.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lakshya Sharma
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
