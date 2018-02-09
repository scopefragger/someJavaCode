package com.scopefragger.service;

import com.scopefragger.model.Customer;
import com.scopefragger.repositroy.CustomerRepository;
import com.scopefragger.repositroy.HibernateCustomerRepositroyImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositroyImpl();

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
