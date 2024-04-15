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
import com.gatepass.dto.StandardsDto;
import com.gatepass.services.StandardsServices;


@RestController
@RequestMapping("/api/standards")
public class StandardsController {

	public StandardsController(StandardsServices standardsServices) {
		super();
		this.standardsServices = standardsServices;
	}
	
	StandardsServices standardsServices;
	
	
	@PostMapping
	public ResponseEntity<SuccessResponse> saveStandards(@RequestBody StandardsDto obj)
	{
		Optional<StandardsDto> savedData=Optional.of(standardsServices.saveStandard(obj));
		SuccessResponse response=new SuccessResponse("success",HttpStatus.OK,"Save Successfull :- "+obj.getStandards(),savedData);
		return 	new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<SuccessResponse> getStandards()
	{
		Optional<List<StandardsDto>> savedData=Optional.of(standardsServices.getStandard());
		SuccessResponse response=new SuccessResponse("success",HttpStatus.OK,"Available Records :- ",savedData);
		return 	new ResponseEntity<>(response,HttpStatus.OK);
	}
	
}
