package com.capg.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="tds_master")
public class TDSMaster {

	@Id
	private int id;
	@NotNull
	private String deductorName;
	@NotNull
	private String deductorPan;
	@NotNull
	private int tdsDeposited;
	
	//getters and setters for bean variables
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeductorName() {
		return deductorName;
	}
	public void setDeductorName(String deductorName) {
		this.deductorName = deductorName;
	}
	public String getDeductorPan() {
		return deductorPan;
	}
	public void setDeductorPan(String deductorPan) {
		this.deductorPan = deductorPan;
	}
	public int getTdsDeposited() {
		return tdsDeposited;
	}
	public void setTdsDeposit(int tdsDeposited) {
		this.tdsDeposited = tdsDeposited;
	}
	
	
}
