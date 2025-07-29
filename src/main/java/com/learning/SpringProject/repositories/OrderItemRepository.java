package com.learning.SpringProject.repositories;

import com.learning.SpringProject.entities.OrderItem;
import com.learning.SpringProject.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
