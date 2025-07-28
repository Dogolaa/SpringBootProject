package com.learning.SpringProject.repositories;

import com.learning.SpringProject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
