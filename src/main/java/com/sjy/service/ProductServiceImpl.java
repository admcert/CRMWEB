package com.sjy.service;

import com.sjy.entities.Product;
import com.sjy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{
    
	@Autowired
	private ProductRepository productRepository;
	//@Override
	//public List<Product> getAll() {
		//return this.productRepository.findAll();
	//}
	@Override
	public Product get(int pId) {
		return this.productRepository.findOne(pId);
	}
	@Override
	public void modify(Product product) {
		this.productRepository.save(product);
		
	}
	@Override
	public void remove(int pId) {
		this.productRepository.delete(pId);
		
	}
	@Override
	public void add(Product product) {
		this.productRepository.save(product);
		
	}
	@Override
	public Page<Product> getAllWithPage(Integer page, Integer size) {
		
		return this.productRepository.findAll(new PageRequest(page, size));
	}
	

}
