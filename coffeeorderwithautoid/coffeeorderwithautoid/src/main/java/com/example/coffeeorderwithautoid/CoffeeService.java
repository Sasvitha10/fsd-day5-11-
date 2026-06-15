package com.example.coffeeorderwithautoid;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoffeeService {

    private List<CoffeeModel> orders = new ArrayList<>();

    private int nextId = 1;

    // Add Coffee Order
    public CoffeeModel addCoffee(CoffeeModel coffee) {

        coffee.setId(nextId++);

        orders.add(coffee);

        return coffee;
    }

    // Get All Orders
    public List<CoffeeModel> getOrders() {

        return orders;
    }
}