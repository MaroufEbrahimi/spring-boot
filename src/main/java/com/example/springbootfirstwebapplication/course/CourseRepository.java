package com.example.springbootfirstwebapplication.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

    Optional<Course> findByIdIgnoreCase(@Param("id") String id);

}
