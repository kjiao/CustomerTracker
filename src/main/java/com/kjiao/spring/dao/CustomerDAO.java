package com.kjiao.spring.dao;

import java.util.List;

import com.kjiao.spring.entity.Customer;


public interface CustomerDAO {

	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int id);

	void deleteCustomer(int id);
}
