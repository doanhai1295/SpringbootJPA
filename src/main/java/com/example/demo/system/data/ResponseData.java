package com.example.demo.system.data;

import java.io.Serializable;

import com.example.demo.system.exception.ApiError;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@AllArgsConstructor
public class ResponseData<T> implements Serializable {
	
	private String status;

	private ApiError error;

	private T body;

	public ResponseData(String status, T body) {
		this.status = status;
		this.error = null;
		this.body = body;
	}
	
	public ResponseData(String status, ApiError error) {
		this.status = status;
		this.error = error;
		this.body = null;
	}
}
