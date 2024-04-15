package com.gatepass.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatepass.Response.dto.SuccessResponse;
import com.gatepass.dto.BranchesDto;
import com.gatepass.services.BranchesSerivces;


@RestController
@RequestMapping("/api/branches")
public class BranchesController {

	public BranchesController(BranchesSerivces brnachesServices) {
		super();
		this.brnachesServices = brnachesServices;
	}
	
	BranchesSerivces brnachesServices;
	
	
	@PostMapping
	public ResponseEntity<SuccessResponse> saveBranch(@RequestBody BranchesDto obj)
	{
		Optional<BranchesDto> savedData=Optional.of(brnachesServices.saveBranch(obj));
		SuccessResponse response=new SuccessResponse("success",HttpStatus.OK,"Save Successfull :- "+obj.getBranch(),savedData);
		return 	new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<SuccessResponse> getStandards()
	{
		Optional<List<BranchesDto>> savedData=Optional.of(brnachesServices.allBranches());
		SuccessResponse response=new SuccessResponse("success",HttpStatus.OK,"Available Records :- ",savedData);
		return 	new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
