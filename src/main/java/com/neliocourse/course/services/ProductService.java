package com.neliocourse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neliocourse.course.entities.Product;
import com.neliocourse.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired // framework dependency injection
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
