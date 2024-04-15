package com.gatepass.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.gatepass.Response.dto.ErrorResponse;

@ControllerAdvice
public class globalExceptionHandler {

	@ExceptionHandler(RuntimeExceptions.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<String> handleMyRuntimeException(RuntimeExceptions ex) {
		return new ResponseEntity<>("Internal Server Error occurred "+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	@ExceptionHandler(DuplicateException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	public ResponseEntity<ErrorResponse> duplicateEntry(DuplicateException ex) {
		ErrorResponse error=new ErrorResponse("Duplicate_Entry",ex.getMessage(),HttpStatus.CONFLICT);
		return new ResponseEntity<>(error, HttpStatus.CONFLICT);
	}
	
	
}
