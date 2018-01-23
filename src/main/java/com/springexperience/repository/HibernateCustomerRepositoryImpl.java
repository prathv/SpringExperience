package com.springexperience.repository;

import java.util.ArrayList;
import java.util.List;

import com.springexperience.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.springexperience.repository.CustomerRepository#findall()
	 */
	@Override
	public List<Customer> findall(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Patty");
		customer.setLastname("Rai");
		
		customers.add(customer);
		
		return customers;
		
	}
}
 