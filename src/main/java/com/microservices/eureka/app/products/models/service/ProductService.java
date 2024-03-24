package com.microservices.eureka.app.products.models.service;

import java.util.List;

import com.microservices.eureka.app.products.models.entity.Product;

public interface ProductService {

	public List<Product> findAll();
	public Product findById(Long id);
}
