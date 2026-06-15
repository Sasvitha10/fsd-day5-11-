package com.example.twotablepostgresql;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class StudentService {
    private final StudentRepository s_repo;

    public StudentService(StudentRepository s_repo) {
        this.s_repo = s_repo;
    }

    public List<Student> getAllStudents() {
        return s_repo.findAll();
    }

    public Student saveStudent(Student student) {
        return s_repo.save(student);
    }

}