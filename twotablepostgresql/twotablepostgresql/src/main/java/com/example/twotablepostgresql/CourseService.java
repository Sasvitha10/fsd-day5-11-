package com.example.twotablepostgresql;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.*;
@Service
public class CourseService {
    private final CourseRepository c_repo;

    public CourseService(CourseRepository c_repo) {
        this.c_repo = c_repo;
    }

    public List<Course> getAllStudents() {
        return c_repo.findAll();
    }

    public Course saveStudent(Course course) {
        return c_repo.save(course);
    }
}
