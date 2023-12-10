package com.full.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.full.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, Integer> {
    
}
