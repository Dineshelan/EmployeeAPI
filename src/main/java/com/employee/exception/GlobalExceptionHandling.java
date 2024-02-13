 package com.employee.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(value = NameNotFoundException.class)
	public ResponseEntity<Object> nameExceptionHandling(NameNotFoundException n) {
		
		return new ResponseEntity<>(n.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = NoSuchElementException.class)
	public ResponseEntity<Object> noSuchElementExceptionHandling(NoSuchElementException nse) {
		
		return new ResponseEntity<>(nse.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = SalaryException.class)
	public ResponseEntity<Object> salaryExceptionHandling(SalaryException se) {
		
		return new ResponseEntity<>(se.getMessage(),HttpStatus.NOT_FOUND);
	}
}
