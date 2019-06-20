package com.lakshya.OpenAPI.service;

import com.lakshya.OpenAPI.domain.Customer;
import com.lakshya.OpenAPI.repositories.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lakshya Sharma
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
