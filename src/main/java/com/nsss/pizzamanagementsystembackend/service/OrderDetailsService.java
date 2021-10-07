package com.nsss.pizzamanagementsystembackend.service;

import com.nsss.pizzamanagementsystembackend.model.Order;
import com.nsss.pizzamanagementsystembackend.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@Service
public class OrderDetailsService {
    @Autowired
    private OrderRepository orderRepository;


//    public Order updateBill(String id) throws IOException {
//        Order order = orderRepository.findById(id).get();
//        Crust crust = crustRepositoru.findById(id).get();
//        Topping topping = toppingRepositoru.findById(id).get();
//
//        if (order.getSize() == "small"){
//            Double tot = 0.00;
//            Double cPrice = 0.00;
//            Double tPrice = 0.00;
//            if(order.getCrust() == crust.getName()) {
//                cPrice = crust.getPrice();
//            }
//            if (order.getTopping() == topping.getName()) {
//                tPrice = topping.getPrice();
//            }
//            tot= (cPrice + tPrice ) * order.getQuantity();
//            order.setBill(tot);
//        }
////
//
//        return orderRepository.save(order);
//    }
//


    public Order getFile(String id) {
        return orderRepository.findById(id).get();
    }

    public Stream<Order> getAllFiles() {
        return orderRepository.findAll().stream();
    }
}


