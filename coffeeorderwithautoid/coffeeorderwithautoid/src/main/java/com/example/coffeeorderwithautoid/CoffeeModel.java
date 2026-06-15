package com.example.coffeeorderwithautoid;
public class CoffeeModel {
    private int id;
    private String Customer_name;
    private String Coffee_type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String Customer_name) {
        this.Customer_name = Customer_name;
    }

    public String getCoffee_type() {
        return Coffee_type;
    }

    public void setCoffee_type(String Coffee_type) {
        this.Coffee_type = Coffee_type;
    }
}