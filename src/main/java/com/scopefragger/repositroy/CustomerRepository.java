package com.scopefragger.repositroy;

import com.scopefragger.model.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}
