package com.sherlock.sync.rabbitmqeventlistener.repository;

import com.sherlock.sync.rabbitmqeventlistener.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {
}
