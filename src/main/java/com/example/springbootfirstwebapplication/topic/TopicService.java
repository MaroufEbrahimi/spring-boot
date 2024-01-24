package com.example.springbootfirstwebapplication.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    // when using derby Database
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);
        return topics;
    }

    public Topic getTopic(String id) {
        return topicRepository.findById(id).orElse(null);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
    
    /* When not using DataBase
    *
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Spring", "Spring Frame", "Spring Frame Desc"),
            new Topic("Java", "Java Tutorials", "Java Tutorials Desc"),
            new Topic("React", "React Tutorials", "React Tutorials Desc"),
            new Topic("Test", "Test Tutorials", "Test Tutorials Desc"),
            new Topic("NEW", "New Tutorials", "New Tutorials Desc")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
//        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topics.stream()
                .filter(t -> t.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseGet(() -> getDefaultTopic());
    }

    private Topic getDefaultTopic() {
        // display this Topic, when does not find the ID
        return new Topic("defaultID", "Default Topic", "Default Desc");
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int a = 0; a < topics.size(); a++) {
            Topic t = topics.get(a);
            if (t.getId().equals(id)) {
                topics.set(a, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
    }
     */
}
