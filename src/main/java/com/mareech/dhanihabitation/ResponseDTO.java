package com.mareech.dhanihabitation;

import org.springframework.http.HttpStatus;

public class ResponseDTO {
	
	HttpStatus status;
	String message;
	Object data;

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ResponseDTO(HttpStatus status, String message, Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}
}
