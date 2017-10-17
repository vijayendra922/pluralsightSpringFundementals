package com.pluralsight.spring.service;

import java.util.List;

import com.pluralsight.spring.Customer;
import com.pluralsight.spring.repository.CustomerRepository;
import com.pluralsight.spring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository=new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.pluralsight.spring.service.CustomerService#findAll()
	 */
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
