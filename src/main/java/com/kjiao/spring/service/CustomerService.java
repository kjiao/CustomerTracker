package com.kjiao.spring.service;

import java.util.List;

import com.kjiao.spring.entity.Customer;

public interface CustomerService {
	List<Customer> getCustomers();

	void saveCustomer(Customer theCustomer);

	Customer getCustomer(int id);

	void deleteCustomer(int id);
}
