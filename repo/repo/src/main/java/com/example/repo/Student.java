package com.example.repo;

public class Student {
    private Long id;
    private String name;

    public Student(long id,String name) {
        this.id = id;
        this.name = name;
    }
    public Long getId(){
        return id;
     }
     public String getName(){
        return name;
    }
}
