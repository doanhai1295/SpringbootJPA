package com.example.demo.system.exception;

import java.util.Set;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ApiError {

	private HttpStatus status;
	
	private String message;
	
	private Set<String> errorCodes;
}
