package com.microservices.eureka.app.products.models.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservices.eureka.app.products.models.entity.Product;
import com.microservices.eureka.app.products.models.repository.ProductRepository;
import com.microservices.eureka.app.products.models.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Product findById(Long id) {

		return productRepository.findById(id).orElse(null);
	}

}
