package com.neliocourse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neliocourse.course.entities.Order;
import com.neliocourse.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired // framework dependency injection
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
