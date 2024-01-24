package com.example.springbootfirstwebapplication.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface TopicRepository extends CrudRepository<Topic, String> {

    Optional<Topic> findByIdIgnoreCase(@Param("id") String id);
}
