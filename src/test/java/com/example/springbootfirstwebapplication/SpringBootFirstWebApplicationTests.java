package com.example.springbootfirstwebapplication;

import com.example.springbootfirstwebapplication.studentDAL.entities.Student;
import com.example.springbootfirstwebapplication.studentDAL.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootFirstWebApplicationTests {

    @Autowired
    private StudentRepository repo;

    @Test
    void testCreateStudent() {
        Student student = new Student();
        student.setName("Marouf");
        student.setCourse("Spring with data JPA");
        student.setFee(50d);
        repo.save(student);
    }

}
