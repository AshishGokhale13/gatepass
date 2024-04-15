package com.gatepass.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatepass.Response.dto.SuccessResponse;
import com.gatepass.dto.UserDto;
import com.gatepass.exceptionhandler.DuplicateException;
import com.gatepass.exceptionhandler.RuntimeExceptions;
import com.gatepass.services.UserServices;

@RestController
@RequestMapping("/api/users")
public class UserController {

	UserServices userService;
	
	
	
	public UserController(UserServices userService1)
	{
		super();
		userService=userService1;
	}
	
	@GetMapping 
	ResponseEntity<SuccessResponse> getAllUsers()
	{
		Optional<List<HashMap<String,Object>>> newData=Optional.of( userService.getAllUser());
		SuccessResponse response=new SuccessResponse("success",HttpStatus.OK,"Records are fetch successfully",newData);
		return new ResponseEntity<>(response,HttpStatus.OK); 
	}
	
	
	@GetMapping("{id}")
	ResponseEntity<SuccessResponse>getUser(@PathVariable("id")Long id)
	{
		Optional<HashMap<String,Object>> newData=Optional.of(userService.getUser(id));
		SuccessResponse response=new SuccessResponse("success",HttpStatus.OK,String.format("Record find for Id : %s",id),newData);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	
	@PostMapping
	ResponseEntity<SuccessResponse> createUser(@RequestBody UserDto user) throws DuplicateException
	{
		Optional<HashMap<String, Object>> saveUser=Optional.of(userService.createUser(user));
		if(saveUser!=null) {
		SuccessResponse successResponse=new SuccessResponse("success",HttpStatus.CREATED,"Account has been created successfully!",saveUser);
		return new ResponseEntity<>(successResponse,HttpStatus.CREATED);
		}
		else {
			throw new RuntimeExceptions("Internal server error");
		}
	}
	
	@PutMapping("{id}")
	ResponseEntity<SuccessResponse> UpdateUser(@RequestBody UserDto user,@PathVariable("id") Long id) throws DuplicateException
	{
		Optional<HashMap<String, Object>> saveUser=Optional.of(userService.updateUser(id,user));
		if(saveUser!=null) {
		SuccessResponse successResponse=new SuccessResponse("success",HttpStatus.OK,"Account has been Updated successfully!",saveUser);
		return new ResponseEntity<>(successResponse,HttpStatus.OK);
		}
		else {
			throw new RuntimeExceptions("Internal server error");
		}
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<SuccessResponse> deleteUser(@PathVariable("id")Long id)
	{
		Optional<String> statusData=Optional.of(userService.deleteUser(id));
		SuccessResponse Response=new SuccessResponse("Success",HttpStatus.OK,"Record deleted",statusData);
		return new ResponseEntity<>(Response,HttpStatus.OK);
	}
	
	@PostMapping("/signin")
	ResponseEntity<SuccessResponse> validateUser(@RequestBody UserDto user) throws Exception
	{
		System.out.println(user.getUsername());
		Optional<HashMap<String, Object>>  statusData=Optional.of(userService.validateUser(user.getUsername(),user.getPassword()));
		SuccessResponse Response=new SuccessResponse("Success",HttpStatus.OK,"login successfull!",statusData);
		return new ResponseEntity<>(Response,HttpStatus.OK);
	}
	
	
}

