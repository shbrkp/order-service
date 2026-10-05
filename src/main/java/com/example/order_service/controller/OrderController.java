package com.example.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @GetMapping("/orders")
    String getOrder(){
        return "Order Service is Updated - 7";
    }
}
