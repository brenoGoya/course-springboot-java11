package com.neliocourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neliocourse.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
