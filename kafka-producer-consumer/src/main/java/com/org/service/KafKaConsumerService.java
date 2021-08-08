package com.org.service;

import java.util.logging.Logger;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.org.AppConstants;

@Service
public class KafKaConsumerService {
	private static final Logger logger = Logger.getLogger(KafKaConsumerService.class.getName());

	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
	public void consume(String message) {
		logger.info(String.format("Message recieved -> %s", message));
	}
}