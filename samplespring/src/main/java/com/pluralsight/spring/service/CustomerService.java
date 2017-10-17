package com.pluralsight.spring.service;

import java.util.List;

import com.pluralsight.spring.Customer;

public interface CustomerService {

	/* (non-Javadoc)
	 * @see com.pluralsight.spring.service.CustomerService#findAll()
	 */
	List<Customer> findAll();

}