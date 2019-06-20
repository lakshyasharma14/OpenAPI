package com.lakshya.OpenAPI.service;

import com.lakshya.OpenAPI.domain.Customer;

import java.util.List;

/**
 * @author Lakshya Sharma
 */
public interface CustomerService {

    Customer findCustomerById(Long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
