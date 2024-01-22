package com.example.springbootfirstwebapplication.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Spring Frame", "Spring Frame Desc"),
                new Topic("Java", "Java Tutorials", "Java Tutorials Desc"),
                new Topic("React", "React Tutorials", "React Tutorials Desc")
        );
    }
}
