package com.app.aforo255.loan.historical.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transaction")
public class Transaction {

	private Integer id;
	private int nroPrestamo;
	private int cuota;
	private double importeCuota;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNroPrestamo() {
		return nroPrestamo;
	}

	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}

	public int getCuota() {
		return cuota;
	}

	public void setCuota(int cuota) {
		this.cuota = cuota;
	}

	public double getImporteCuota() {
		return importeCuota;
	}

	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}

}
