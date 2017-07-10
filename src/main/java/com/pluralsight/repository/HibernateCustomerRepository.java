package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;
@Repository()
public class HibernateCustomerRepository implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList();
		Customer customer = new Customer("vijay", "Moganti");
		//customer.setFirstName("vijay");
		//customer.setLastName("Moganti");
		customers.add(customer);
		return customers;
		
		
	}

}
