package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.dsdeliver.entity.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {

	@Query("SELECT DISTINCT obj FROM Order obj join fetch "
			+ " obj.products where obj.status = 0 order by obj.moment asc")
	List<Order> findOrderWithProduct();
	
}
