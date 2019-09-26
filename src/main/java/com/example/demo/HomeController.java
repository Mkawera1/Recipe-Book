package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String About() {
        return "About";
    }

    @GetMapping("/RoastedPotatoes")
        public String RoastedPotatoes(){
        return "RoastedPotatoes";
    }

}