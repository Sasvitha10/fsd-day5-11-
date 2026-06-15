package com.example.coffeeorder;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.ArrayList;

@Service
public class CoffeeService {
    private List<String> orders= new ArrayList<>();

    //Business logic:add a coffee order
    public String orderCoffee(String type){
        orders.add(type);

        return "Order placed for: "+ type;
    }
    //Business logic: list all orders
    public List<String> getOrders(){
        return orders;
    }
}
