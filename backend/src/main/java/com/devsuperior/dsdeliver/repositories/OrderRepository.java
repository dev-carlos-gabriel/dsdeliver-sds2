package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dsdeliver.entity.Product;

public interface OrderRepository extends JpaRepositoryImplementation<Product, Long> {

}
