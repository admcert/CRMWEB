package com.sjy.repository;

import com.sjy.entities.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	/**
	 * 根据姓名中包含某字获取当前客户
	 * @param customerName
	 * @return
	 */
   List<Customer> findByCustomerNameContaining(String customerName);
   
   /**
    * 分页方式获取所有客户
    */
   Page<Customer> findAll(Pageable pageable);
}
