package com.example.rahulfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() { return "red bus booking";}


}