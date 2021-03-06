package com.sjy.service;

import java.util.List;

import com.sjy.entities.Customer;
import com.sjy.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService{
    
	@Autowired
	private CustomerRepository customerRepository;
	
	
	@Override
	public List<Customer> getAll() {
		return this.customerRepository.findAll();
	}


	@Override
	public void add(Customer customer) {
		this.customerRepository.save(customer);
		
	}


	@Override
	public Customer get(int csId) {
		return this.customerRepository.findOne(csId);
	}


	@Override
	public void modify(Customer customer) {
		this.customerRepository.save(customer);
		
	}


	@Override
	public List<Customer> search(String customerName) {
		return this.customerRepository.findByCustomerNameContaining(customerName);
	}


	@Override
	public Page<Customer> getAllWithPage(Integer page, Integer pageSize) {
		return this.customerRepository.findAll(new PageRequest(page, pageSize));
	}
	
}
