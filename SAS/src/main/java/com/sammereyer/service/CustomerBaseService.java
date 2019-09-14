package com.sammereyer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sammereyer.domain.CustomerBase;
import com.sammereyer.repository.CustomerBaseRepository;

@Service("customerBaseService")
public class CustomerBaseService {

	@Autowired
	private CustomerBaseRepository repo;
	
	public CustomerBase saveCustomer(CustomerBase customerBase) {
		return repo.save(customerBase);
	}
}
