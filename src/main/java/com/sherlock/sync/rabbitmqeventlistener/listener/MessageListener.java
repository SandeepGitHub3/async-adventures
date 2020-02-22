package com.sherlock.sync.rabbitmqeventlistener.listener;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sherlock.sync.rabbitmqeventlistener.model.Event;
import com.sherlock.sync.rabbitmqeventlistener.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class MessageListener {
	private static final Logger logger = LoggerFactory.getLogger(MessageListener.class);

	private final ObjectMapper objectMapper;
	private final EventRepository eventRepository;

	@RabbitListener(queues = "java-labs-queue")
	public void listen(Event event) throws JsonProcessingException {
		logger.info("Message Consumed :{}", objectMapper.writeValueAsString(event));
		eventRepository.save(event);
	}
}
