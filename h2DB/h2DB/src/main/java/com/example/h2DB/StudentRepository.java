package com.example.h2DB;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends
        JpaRepository<Student,Long> {
}



//explanation
//JpaRepository<Student,Long>
//JpaRepository is a Spring Data JPA interface that already has all the common CRUD methods built in.
// *By extending it, your StudentRepository automatically gets method like:
//save(Student s) -> insert/update  a student
// findAll() -> get all students
// findById(Long id)-> get one student
//deleteById(Long Id)-> delete a student
//You don't need to write SQL or implement these method yourself - Spring generates them at runtime.

//2.<Student,Long>
// the first type parameter (Student) tells JPA which entity this repository manages.
//->It's tied to your Student table.
//The second type parameter (Long) tells JPA the type of the primary key(id).
//->since your Student entity has private Long id; you specify Long.

//3.public interface StudentRepository
//It's an interface,not a class.
//you don't write any code inside -- Spring Boot automatically creates a working implementation at runtime.