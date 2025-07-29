package com.learning.SpringProject.repositories;

import com.learning.SpringProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
