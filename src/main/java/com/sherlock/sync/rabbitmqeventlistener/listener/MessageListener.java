package com.sherlock.sync.rabbitmqeventlistener.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sherlock.sync.rabbitmqeventlistener.model.Event;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {
	private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

	private final ObjectMapper objectMapper;

	public MessageListener(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}

	@RabbitListener(queues = "java-labs-queue")
	public void listen(Event event) throws JsonProcessingException {
		logger.info("Message Consumed :{}", objectMapper.writeValueAsString(event));
	}
}
