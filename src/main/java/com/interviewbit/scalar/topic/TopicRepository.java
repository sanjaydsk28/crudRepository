package com.interviewbit.scalar.topic;

// CRUD Repository provided by JPA
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
    public Topic findByTitle(String title);
}
