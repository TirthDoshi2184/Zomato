package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.CustomerEntity;
import com.repository.CustomerRepository;

@RestController
public class CustomerController {

	@Autowired
	CustomerRepository CustomerRepository;
	
	@PostMapping("/customersignup")
	public CustomerEntity CustomerSignup(@RequestBody CustomerEntity customerEntity) {
		CustomerRepository.save(customerEntity);
		return customerEntity;
	}
}
