package com.pluralsight.spring.repository;

import java.util.List;

import com.pluralsight.spring.Customer;

public interface CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	List<Customer> findAll();

}