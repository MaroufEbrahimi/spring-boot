package com.example.springbootfirstwebapplication.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, String> {

    Optional<Course> findByIdIgnoreCase(@Param("id") String id);
}
