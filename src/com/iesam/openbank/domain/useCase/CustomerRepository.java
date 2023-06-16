package com.iesam.openbank.domain.useCase;

import com.iesam.openbank.domain.models.Customer;

public interface CustomerRepository {
    public void saveCustomer(Customer customer);
    public Customer findById(Integer id);
}
