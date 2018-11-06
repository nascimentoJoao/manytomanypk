package com.example.manymap.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.manymap.repository.ProductRepository;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductRepository prodRepository;

}
