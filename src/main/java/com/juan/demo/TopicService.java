package com.juan.demo;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Null;

@Service
public class TopicService {
//
//    private List<Topic> topics = new ArrayList<>(Arrays.asList(
//            new Topic("Spring", "Spring Framework", "SpringFramework description"),
//            new Topic("java","Core Java", " Core Java Description")
//
//    ));

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(Long id){
        //return topics.stream().filter(t ->t.getId().equals(id)).findFirst().get();
      return topicRepository.findOne(id);
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Long id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(Long id){
        //topics.removeIf(t-> t.getId().equals(id));
        topicRepository.delete(id);
    }



}
