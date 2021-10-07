package com.nsss.pizzamanagementsystembackend.repository;

import com.nsss.pizzamanagementsystembackend.model.Crust;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CrustRepository extends MongoRepository<Crust, String> {
    Optional<Crust> findByName(String crustName);
    List<Crust> findAllByName(String crustName);
}