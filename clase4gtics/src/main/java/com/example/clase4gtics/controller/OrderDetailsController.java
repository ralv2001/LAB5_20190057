package com.example.clase4gtics.controller;

import com.example.clase4gtics.entity.OrderDetails;
import com.example.clase4gtics.repository.OrderDetailsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OrderDetailsController {

    final OrderDetailsRepository orderDetailsRepository;

    public OrderDetailsController(OrderDetailsRepository orderDetailsRepository) {
        this.orderDetailsRepository = orderDetailsRepository;
    }

    @GetMapping("/order_details")
    public String lista(Model model) {

        List<OrderDetails> list = orderDetailsRepository.findAll();
        for(OrderDetails od: list){
            System.out.println(od.getOrder().getId() + " | " + od.getProduct().getProductname() + ": " + od.getQuantity());
        }

        return "";
    }
}
