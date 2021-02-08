package com.neliocourse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neliocourse.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
