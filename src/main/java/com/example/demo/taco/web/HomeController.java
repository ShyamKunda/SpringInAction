package com.example.demo.taco.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home(){
        System.out.println("Entered into controller");
        return  "home";
    }
}
