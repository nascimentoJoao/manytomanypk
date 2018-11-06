package com.example.manymap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.manymap.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
