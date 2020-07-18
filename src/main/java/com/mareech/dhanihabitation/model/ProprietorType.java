package com.mareech.dhanihabitation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "proprietor_type")
public class ProprietorType extends Common{
	
	@Column(name = "name", length = 25, nullable = false)
	private String name;
	
	@Column(name = "status", length = 5, nullable = false)
	private String status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
