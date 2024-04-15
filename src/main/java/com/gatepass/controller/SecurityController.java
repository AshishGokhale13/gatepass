package com.gatepass.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatepass.Response.dto.SuccessResponse;
import com.gatepass.dto.SecurityDto;
import com.gatepass.services.SecurityServices;
@RestController
@RequestMapping("/api/security")
public class SecurityController {

		SecurityServices securityServices;
		
		public SecurityController(SecurityServices securityServices) {
			super();
			this.securityServices = securityServices;
		}





		@PostMapping
		public ResponseEntity<SuccessResponse> saveVector(@ModelAttribute SecurityDto dto)
		{
			Optional<SecurityDto> savedData = Optional.of(securityServices.addSecurity(dto));
			SuccessResponse response = new SuccessResponse("success", HttpStatus.OK,
					"Added Successfully :- " + dto.getName(), savedData);
			return new ResponseEntity<>(response,HttpStatus.OK);
		}
}
