package com.nsss.pizzamanagementsystembackend.repository;

import com.nsss.pizzamanagementsystembackend.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findAllByDeliveredIsFalse();
    List<Order> findAllByDeliveredIsTrue();
    List<Order> findAllByDeliveryRiderContainingAndDeliveredIsFalse(String riderName);
    List<Order> findAllByDeliveryRiderContainingAndDeliveredIsTrue(String riderName);
    List<Order> findAllByCustomerName(String customerName);
    List<Order> findAllByOrderTimestampBetween(Date from, Date to);
}
