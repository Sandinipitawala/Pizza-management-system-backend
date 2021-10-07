package com.nsss.pizzamanagementsystembackend.repository;
import com.nsss.pizzamanagementsystembackend.model.Topping;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ToppingRepository extends MongoRepository<Topping, String> {
    Optional<Topping> findByName(String toppingName);
    List<Topping> findAllByName(String toppingName);
}