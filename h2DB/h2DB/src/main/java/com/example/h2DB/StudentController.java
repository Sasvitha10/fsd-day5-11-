package com.example.h2DB;
import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentRepository repo;
    public StudentController(StudentRepository repo){
        this.repo= repo;
    }
    @GetMapping
    public List<Student> getStudents(){
        return repo.findAll();
    }
    @PostMapping
    public Student addStudent(@RequestBody Student s){
        return repo.save(s);
    }
}



//RERUN server in intelij
//REFRESH h2-console in brower
//u will see tables got created now