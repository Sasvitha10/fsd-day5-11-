package com.example.frontendbackend;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition {
    @GetMapping("/calc/addd/{n1}/{n2}")
    public Map<String,Object> addd(@PathVariable int n1, @PathVariable int n2){
        return Map.of("operation","addition","result",n1+n2) ;
    }
}
