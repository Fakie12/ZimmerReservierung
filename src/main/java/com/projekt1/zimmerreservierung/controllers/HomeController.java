package com.projekt1.zimmerreservierung.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "index";

    }
    @GetMapping("/posts")
    public String posts(){
        return "your posts";
    }
}
