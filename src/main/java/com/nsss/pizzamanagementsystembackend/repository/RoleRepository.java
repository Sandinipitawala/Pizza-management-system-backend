package com.nsss.pizzamanagementsystembackend.repository;

import com.nsss.pizzamanagementsystembackend.model.ERole;
import com.nsss.pizzamanagementsystembackend.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
