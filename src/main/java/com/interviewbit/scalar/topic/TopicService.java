package com.interviewbit.scalar.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private  TopicRepository topicRepository;

    public  List<Topic> getTopics() {
        return (List<Topic>) topicRepository.findAll();
    }

    public Optional<Topic> getTopic(String id) {
        return  topicRepository.findById(id);
    }

    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void editTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
