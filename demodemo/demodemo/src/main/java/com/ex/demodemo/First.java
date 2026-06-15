package com.ex.demodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping("/name")
    public String sayName() {
        return "sasvitha";
    }

    @GetMapping("/Address")
    public String sayAddress() {
        return "OOTY";
    }

    @GetMapping("/color")
    public String sayColor() {
        return "Black";
    }
}
