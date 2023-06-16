package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Customer;

public class getCustomerUseCase {
    private CustomerRepository customerRepository;

    public getCustomerUseCase(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer execute(Integer id) {
        return customerRepository.findById(id);
    }
}
