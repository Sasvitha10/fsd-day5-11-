package com.example.twotablepostgresql;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/course")
public class CourseController {
    private final CourseRepository c_repo;

    public CourseController(CourseRepository c_repo){
        this.c_repo=c_repo;
    }
    @GetMapping
    public List<Course> getAll(){
        return c_repo.findAll();
    }
    @PostMapping
    Course add(@RequestBody Course m){
        return c_repo.save(m);
    }
}
