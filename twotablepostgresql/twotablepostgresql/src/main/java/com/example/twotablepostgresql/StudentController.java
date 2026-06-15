package com.example.twotablepostgresql;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentRepository s_repo;

    public StudentController(StudentRepository s_repo){
        this.s_repo=s_repo;
    }
    @GetMapping
    public List<Student> getAll(){
        return s_repo.findAll();
    }
    @PostMapping Student add(@RequestBody Student n){
        return s_repo.save(n);
    }

}
