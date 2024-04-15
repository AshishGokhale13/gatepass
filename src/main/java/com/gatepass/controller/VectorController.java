package com.gatepass.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatepass.Response.dto.SuccessResponse;
import com.gatepass.dto.VectorDto;
import com.gatepass.dto.Rector.RectorDto;
import com.gatepass.services.VectorServices;

@RestController
@RequestMapping("/api/vector")
public class VectorController {

	VectorServices vectorService;

	public VectorController(VectorServices vectorService) {
		super();
		this.vectorService = vectorService;
	}

	@GetMapping
	public ResponseEntity<SuccessResponse> getName()
	{
		
		Optional<List<RectorDto>> rectorsData = Optional.of(vectorService.getRector());
		SuccessResponse response = new SuccessResponse("success",HttpStatus.OK,"Fetched Successfully",rectorsData);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	@PostMapping
	public ResponseEntity<SuccessResponse> saveVector(@ModelAttribute VectorDto dto)
	{
		
		Optional<RectorDto> savedData = Optional.of(vectorService.saveVector(dto));
		SuccessResponse response = new SuccessResponse("success", HttpStatus.OK,
				"Added Successfully :- " + dto.getName(), savedData);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

}
