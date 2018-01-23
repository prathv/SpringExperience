package com.springexperience.service;

import java.util.List;

import com.springexperience.model.Customer;
import com.springexperience.repository.CustomerRepository;
import com.springexperience.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository cr = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.springexperience.service.CustomerService#findall()
	 */
	@Override
	public List<Customer> findall(){
		return cr.findall();
	}
}
