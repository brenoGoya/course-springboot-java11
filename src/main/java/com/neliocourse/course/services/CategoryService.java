package com.neliocourse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neliocourse.course.entities.Category;
import com.neliocourse.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired // framework dependency injection
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
