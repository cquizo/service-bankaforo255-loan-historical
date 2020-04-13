package com.app.aforo255.loan.historical.service;

import com.app.aforo255.loan.historical.model.entity.Transaction;

public interface ITransactionService {

	Transaction save(Transaction transaction);
	Iterable<Transaction> findByNroPrestamo(Integer nroPrestamo);
}
