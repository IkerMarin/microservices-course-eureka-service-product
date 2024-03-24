package com.microservices.eureka.app.products.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.eureka.app.products.models.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
