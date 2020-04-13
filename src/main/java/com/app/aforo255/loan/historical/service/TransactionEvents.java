package com.app.aforo255.loan.historical.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.loan.historical.model.entity.Transaction;
import com.app.aforo255.loan.historical.model.repository.TransactionRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class TransactionEvents {

	private static Logger log = LoggerFactory.getLogger(TransactionEvents.class);

	@Autowired
	private TransactionRepository repository;
	@Autowired
	ObjectMapper objectMapper;

	public void processTransactionEvent(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {

		Transaction transactionEvent = objectMapper.readValue(consumerRecord.value(), Transaction.class);
		log.info("transactionEvent : {} ", transactionEvent);
		repository.save(transactionEvent);
		log.info("Successfully Persisted the transaction Event {} ", transactionEvent);
	}

}
