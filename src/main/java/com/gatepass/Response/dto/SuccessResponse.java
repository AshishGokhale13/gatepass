package com.gatepass.Response.dto;

import java.util.Optional;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SuccessResponse {

	String status;
	HttpStatus statusCode;
	String SuccessMessage;
	Optional<?> data;
	
}
