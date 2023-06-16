package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Customer;

public class addCustomerUseCase {
    private CustomerRepository customerRepository;

    public addCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(Customer customer) {
        customerRepository.saveCustomer(customer);
    }
}
