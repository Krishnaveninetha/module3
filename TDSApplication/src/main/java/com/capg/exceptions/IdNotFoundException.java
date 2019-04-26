package com.capg.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//exception class
@ResponseStatus(HttpStatus.NOT_FOUND)
public class IdNotFoundException extends Exception{

	public IdNotFoundException(String msg) {
		super(msg);
	}
}
