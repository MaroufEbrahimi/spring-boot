package com.example.springbootfirstwebapplication.studentDAL.repos;

import com.example.springbootfirstwebapplication.studentDAL.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
