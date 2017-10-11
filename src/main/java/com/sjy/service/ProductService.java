package com.sjy.service;

import com.sjy.entities.Product;
import org.springframework.data.domain.Page;


public interface ProductService {
 // List<Product> getAll();

  Product get(int pId);

void modify(Product product);

void remove(int pId);

void add(Product product);

Page<Product> getAllWithPage(Integer page, Integer size);
}
