package com.example.twotablepostgresql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;
    private String c_name;
    private Long s_id;
    public Course(){}
    public Course(String c_name){
        this.c_name = c_name;
    }
    public Long c_id(){ return c_id;}
    public String getc_name(){
        return c_name;
    }
    public Long getc_id(){
        return c_id;
    }
    public void setc_name(){
        this.c_name= c_name;
    }
}
