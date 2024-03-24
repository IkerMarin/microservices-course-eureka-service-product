package com.microservices.eureka.app.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.eureka.app.products.models.entity.Product;
import com.microservices.eureka.app.products.models.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products/product-list")
	public List<Product> getProductList(){
		return productService.findAll();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductDetail(@PathVariable Long id) {
		Product product = productService.findById(id);
		return product;
	}

}
