package com.lakshya.OpenAPI.bootstrap;

import com.lakshya.OpenAPI.domain.Customer;
import com.lakshya.OpenAPI.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Lakshya Sharma
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Setting up Customer Data");
        Customer c1 = new Customer();
        c1.setFirstName("Lakshya");
        c1.setLastName("Sharma");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("A");
        c2.setLastName("P");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("I");
        c3.setLastName("S");
        customerRepository.save(c3);
        System.out.println("Customer Data is set up count:" + customerRepository.count());
    }
}
