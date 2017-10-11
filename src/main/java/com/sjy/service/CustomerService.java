package com.sjy.service;

import java.util.List;

import com.sjy.entities.Customer;
import org.springframework.data.domain.Page;


public interface CustomerService {
    List<Customer> getAll();
    
    void add(Customer customer);
    
    Customer get(int csId);
    
    void modify(Customer customer);
    
    List<Customer> search(String customerName);
    
    Page<Customer> getAllWithPage(Integer page, Integer pageSize);
}
