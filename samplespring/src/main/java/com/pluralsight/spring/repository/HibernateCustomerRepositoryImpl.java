package com.pluralsight.spring.repository;


import java.util.ArrayList;
import java.util.List;

import com.pluralsight.spring.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Vijay");
		customer.setLastname("Yalavarthi");
		
		customers.add(customer);
		
		return customers;
	}
}

