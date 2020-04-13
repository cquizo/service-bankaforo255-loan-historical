package com.app.aforo255.loan.historical.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.loan.historical.model.entity.Transaction;
import com.app.aforo255.loan.historical.model.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements ITransactionService {

	@Autowired
	private TransactionRepository repository;
	
	@Override
	public Transaction save(Transaction transaction) {
		return repository.save(transaction);
	}

	@Override
	public Iterable<Transaction> findByNroPrestamo(Integer nroPrestamo) {
		return repository.findByNroPrestamo(nroPrestamo);
	}
}
