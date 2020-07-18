package com.mareech.dhanihabitation.exception;

public class ProprietorNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ProprietorNotFoundException(String message){
		super(message);
	}
}