package com.nsss.pizzamanagementsystembackend.repository;

import com.nsss.pizzamanagementsystembackend.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
    List<User> findByUsernameContaining(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}
