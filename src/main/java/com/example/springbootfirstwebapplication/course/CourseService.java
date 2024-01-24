package com.example.springbootfirstwebapplication.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    // when using derby Database
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId)
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
//        return topicRepository.findById(id).orElse(null);
        return courseRepository.findByIdIgnoreCase(id).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
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
