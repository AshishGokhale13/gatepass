package com.gatepass.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatepass.Response.dto.SuccessResponse;
import com.gatepass.dto.WardensDto;
import com.gatepass.services.WardensServices;

@RestController
@RequestMapping("/api/wardens")
public class WardensController {

	WardensServices wardenService;

	public WardensController(WardensServices wardenService) {
		super();
		this.wardenService = wardenService;
	}
	


	@PostMapping
	public ResponseEntity<SuccessResponse> saveVector(@ModelAttribute WardensDto dto)
	{
		
		Optional<WardensDto> savedData = Optional.of(wardenService.addWarden(dto));
		SuccessResponse response = new SuccessResponse("success", HttpStatus.OK,
				"Added Successfully :- " + dto.getName(), savedData);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

	
	
}
