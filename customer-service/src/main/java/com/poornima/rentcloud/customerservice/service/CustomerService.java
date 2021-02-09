package com.poornima.rentcloud.customerservice.service;

import com.poornima.rentcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
