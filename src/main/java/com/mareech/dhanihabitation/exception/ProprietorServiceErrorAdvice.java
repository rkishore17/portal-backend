package com.mareech.dhanihabitation.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;

@ControllerAdvice
public class ProprietorServiceErrorAdvice {
	private static final Logger logger = LogManager.getLogger(ProprietorServiceErrorAdvice.class);
	
	@ExceptionHandler({ProprietorNotFoundException.class})
    public ResponseEntity<String> handleRunTimeException(ProprietorNotFoundException e) {
        return error(INTERNAL_SERVER_ERROR, e);
    }
	
	@ExceptionHandler({RuntimeException.class})
    public ResponseEntity<String> handleNotFoundException(RuntimeException e) {
        return error(NOT_FOUND, e);
    }

    private ResponseEntity<String> error(HttpStatus status, Exception e) {
    	logger.error("Exception-Message: ", e);
        return ResponseEntity.status(status).body(e.getMessage());
    }
}
