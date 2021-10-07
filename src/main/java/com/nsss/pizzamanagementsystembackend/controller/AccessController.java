package com.nsss.pizzamanagementsystembackend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/access")
public class AccessController {

    @GetMapping("/users/add")
    @PreAuthorize("hasRole('ADMIN')")
    public String addUsers(){
        return "Add users here";
    }

    @GetMapping("/users/reports")
    @PreAuthorize("hasRole('ADMIN')")
    public String reportsUsers(){
        return "Users reports here";
    }

    @GetMapping("/crusts/add")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public String addCrusts(){
        return "Add crusts here";
    }

    @GetMapping("/crusts/reports")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public String reportsCrusts(){
        return "Crusts reports here";
    }

    @GetMapping("/toppings/add")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public String addToppings(){
        return "Add toppings here";
    }

    @GetMapping("/toppings/reports")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    public String reportsToppings(){
        return "Toppings reports here";
    }

    @GetMapping("/orders/add")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER') or hasRole('CASHIER')")
    public String addOrders(){
        return "Add orders here";
    }

    @GetMapping("/orders/reports")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER') or hasRole('CASHIER')")
    public String reportsOrders(){
        return "Orders reports here";
    }

    @GetMapping("/delivery/add")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER') or hasRole('CASHIER')")
    public String addDelivery(){
        return "Add delivery here";
    }

    @GetMapping("/delivery/reports")
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER') or hasRole('CASHIER')")
    public String reportsDelivery(){
        return "Delivery reports here";
    }
}
