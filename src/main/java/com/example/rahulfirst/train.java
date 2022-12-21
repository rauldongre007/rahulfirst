package com.example.rahulfirst;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class train {
    @GetMapping("/train")
    public String getData() { return "This is my first train travel from MUMBAI to AURANGABAD";}

}
