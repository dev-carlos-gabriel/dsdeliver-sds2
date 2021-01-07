package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dsdeliver.entity.Product;

public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {
	
	public List<Product> findAllByOrderByNameAsc();

}
