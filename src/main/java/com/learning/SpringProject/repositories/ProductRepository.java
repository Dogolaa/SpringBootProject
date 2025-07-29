package com.learning.SpringProject.repositories;

import com.learning.SpringProject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
