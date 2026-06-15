package com.example.coffeeorderwithautoid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffee")
@CrossOrigin("*")
public class CoffeeController {

    private final CoffeeService service;

    public CoffeeController(CoffeeService service) {
        this.service = service;
    }

    @PostMapping
    public CoffeeModel addCoffee(@RequestBody CoffeeModel coffee) {

        return service.addCoffee(coffee);
    }

    @GetMapping
    public List<CoffeeModel> getOrders() {

        return service.getOrders();
    }
}