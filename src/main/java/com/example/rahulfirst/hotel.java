package com.example.rahulfirst;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hotel {
    @GetMapping("/hotel")
    public String getData() { return "Sagar hotel booking";}


}
