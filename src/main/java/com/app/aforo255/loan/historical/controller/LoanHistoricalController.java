package com.app.aforo255.loan.historical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.loan.historical.model.entity.Transaction;
import com.app.aforo255.loan.historical.service.ITransactionService;

@RestController
public class LoanHistoricalController {

	@Autowired
	private ITransactionService transaction;

	@GetMapping("/listar/{nroPrestamo}")
	public ResponseEntity<?> obtenerTansacciones(@PathVariable Integer nroPrestamo) {
		Iterable<Transaction> Itransaction = transaction.findByNroPrestamo(nroPrestamo);
		return ResponseEntity.ok(Itransaction);
	}
}
