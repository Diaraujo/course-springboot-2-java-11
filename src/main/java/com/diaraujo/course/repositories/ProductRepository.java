package com.diaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diaraujo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
