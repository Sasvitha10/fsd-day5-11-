package com.example.repo;
import java.util.*;
import java.util.ArrayList;

public class StudentRepository {
    private final List<Student> students= new ArrayList<>();
    public List<Student> findAll(){
        return students;
    }
    public void save(Student s){
        students.add(s);
    }
}
