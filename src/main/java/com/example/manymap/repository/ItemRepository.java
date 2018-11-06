package com.example.manymap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.manymap.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long>{

}
