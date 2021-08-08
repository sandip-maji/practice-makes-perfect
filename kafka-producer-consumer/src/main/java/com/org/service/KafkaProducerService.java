package com.org.service;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import com.org.AppConstants;

@Service
public class KafkaProducerService {
	
	private static final Logger logger = Logger.getLogger(KafKaConsumerService.class.getName());
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	
	public void send(String message) {
	    ListenableFuture<SendResult<String, String>> listenableFuture = kafkaTemplate.send(AppConstants.TOPIC_NAME, message);
	    
	    try {
			SendResult<String, String> sendResult = listenableFuture.get();
			
			logger.info("RecordMetadata : "+sendResult.getRecordMetadata());
			logger.info("ProducerRecord : "+sendResult.getProducerRecord());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}