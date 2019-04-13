package com.example.demo.system.data;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.system.constant.ResponseStatusConst;
import com.example.demo.system.exception.ApiError;

@SuppressWarnings("serial")
public class ResponseDataConfig implements Serializable {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> ResponseEntity<T> success(T body, HttpStatus status) {
		return new ResponseEntity(new ResponseData(ResponseStatusConst.SUCCESS, body), status);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ResponseEntity error(ApiError error, HttpStatus status) {
		return new ResponseEntity(new ResponseData(ResponseStatusConst.ERROR, error), status);
	}
}
