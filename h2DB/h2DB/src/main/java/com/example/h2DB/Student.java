package com.example.h2DB;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student{
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Student(){}
        public Student(String name){
            this.name=name;
    }
    public Long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}


//explanation
//public Student(){} -- required by JPA(Hibernate uses it internally)
//public Studeynt(String name) -- convenience constructor for quick object creation.