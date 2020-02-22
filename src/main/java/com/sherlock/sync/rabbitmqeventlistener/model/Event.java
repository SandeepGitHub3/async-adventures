package com.sherlock.sync.rabbitmqeventlistener.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@Document
public class Event {
	private String orderId;
	private List<Product> products;
	private Recipient recipient;
}
