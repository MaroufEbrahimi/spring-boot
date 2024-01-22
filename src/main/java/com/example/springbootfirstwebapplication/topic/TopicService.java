package com.example.springbootfirstwebapplication.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = Arrays.asList(
            new Topic("Spring", "Spring Frame", "Spring Frame Desc"),
            new Topic("Java", "Java Tutorials", "Java Tutorials Desc"),
            new Topic("React", "React Tutorials", "React Tutorials Desc")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
