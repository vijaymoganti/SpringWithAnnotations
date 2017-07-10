package com.pluralsight.service;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	//@Autowired
	private CustomerRepository cr;
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository1){
		System.out.println("We are using constructor injection");
		this.cr = customerRepository1;
	}
	//@Autowired
	/*public void setCr(CustomerRepository cr) {
		System.out.println("We are using setter injection");
		this.cr = cr;
	}*/
	@PostConstruct
	public void myInitMethod(){
		System.out.println("My init method");
	}
	@PreDestroy
	public void myDestroyMethod(){
		System.out.println("My destory method");
	}

	@Override
	public List<Customer> findAll() {
		return cr.findAll();

	}

}
