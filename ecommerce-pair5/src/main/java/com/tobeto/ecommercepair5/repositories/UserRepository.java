package com.tobeto.ecommercepair5.repositories;


import com.tobeto.ecommercepair5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
