package com.springexperience.repository;

import java.util.List;

import com.springexperience.model.Customer;

public interface CustomerRepository {

	List<Customer> findall();

}