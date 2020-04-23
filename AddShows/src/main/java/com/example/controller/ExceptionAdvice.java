package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import com.example.services.DatabaseException;

@ControllerAdvice
public class ExceptionAdvice extends ResponseEntityExceptionHandler {	
	    @ExceptionHandler(DatabaseException.class)
        public ResponseEntity<ScreenError>  mapError(DatabaseException ex) {
        	ScreenError error = new ScreenError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());  
        	return new ResponseEntity<ScreenError>(error,HttpStatus.INTERNAL_SERVER_ERROR);
        }
}

class ScreenError {
	private int errorCode;
    private String errorMsg;
	public ScreenError(int errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
