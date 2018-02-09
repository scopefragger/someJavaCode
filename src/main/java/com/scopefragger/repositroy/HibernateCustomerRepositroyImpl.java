package com.scopefragger.repositroy;

import com.scopefragger.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositroyImpl implements CustomerRepository {

    public List<Customer> findAll() {

        List<Customer> customerList = new ArrayList<Customer>();

        Customer customer = new Customer();
        customer.setFirstName("bob");
        customer.setLastName("kelshaw");
        customerList.add(customer);

        return customerList;

    }

}
