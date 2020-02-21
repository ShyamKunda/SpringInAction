package com.example.demo.taco.web;

import com.example.demo.taco.model.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/orders")
public class OrderController {


    @GetMapping("/current")
    public String orderFormModel(Model model){

        model.addAttribute("order", new Order() );
        return "orderform";
    }

    @PostMapping("/")
    public String processOrder(Order order) {
        log.info("Order submitted: " + order);
        return "redirect:/";
    }
}
