package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Models.UserModel;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
 
    boolean existsByEmail(String email);

    Optional<UserModel> findByEmail(String email);
}