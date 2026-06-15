package com.ex.mode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Third {
    @GetMapping("/add/{n1}/{n2}")
    public int Display(@PathVariable int n1, @PathVariable int n2){
       int c= n1+ n2;
        return  + c;
    }
}
