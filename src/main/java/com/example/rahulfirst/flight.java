package com.example.rahulfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class flight {
    @GetMapping("/flight")
    public String getData() { return "AEROPLANE01 AKASH AIRLINE will  travel today" ;}

}
