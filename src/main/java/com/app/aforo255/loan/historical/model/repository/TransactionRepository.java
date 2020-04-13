package com.app.aforo255.loan.historical.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.aforo255.loan.historical.model.entity.Transaction;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, String> {

	@Query("{'nroPrestamo': ?0}")
	Iterable<Transaction> findByNroPrestamo(Integer nroPrestamo);
	
}
