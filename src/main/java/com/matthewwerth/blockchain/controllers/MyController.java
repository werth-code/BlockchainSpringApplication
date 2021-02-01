package com.matthewwerth.blockchain.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("hello");
        return "Hello Good Sir!";
    }
}
