package com.learning.SpringProject.repositories;

import com.learning.SpringProject.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
