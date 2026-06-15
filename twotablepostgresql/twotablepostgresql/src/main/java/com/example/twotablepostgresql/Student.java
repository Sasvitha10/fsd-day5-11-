package com.example.twotablepostgresql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long s_id;
    private String s_name;
    private Long c_id;
    public Student(){}
    public Student(String s_name){
        this.s_name=s_name;
    }
    public Long gets_id(){return s_id;}
    public String gets_name(){
        return s_name;
    }
    public Long getc_ID(){
        return c_id;
    }
//    public String gets_name(){
//        return name;
//    }
    public void sets_name(){
    this.s_name= s_name;
    }
}
