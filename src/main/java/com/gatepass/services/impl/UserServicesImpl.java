package com.gatepass.services.impl;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.gatepass.dto.UserDto;
import com.gatepass.exceptionhandler.DuplicateException;
import com.gatepass.exceptionhandler.RuntimeExceptions;
import com.gatepass.mapper.UserMapper;
import com.gatepass.model.Users;
import com.gatepass.repository.UserRepository;
import com.gatepass.services.UserServices;

@Service
public class UserServicesImpl implements UserServices {

	private UserRepository userRepo;

	public UserServicesImpl(UserRepository repo) {
		super();
		userRepo = repo;
	}

	@Override
	public HashMap<String, Object> createUser(UserDto userDto) throws DuplicateException {
		Users newUser = UserMapper.maptoUser(userDto);
		if(!userRepo.findByContact(newUser.getContact()).isEmpty()) {
			throw new DuplicateException(String.format(UserRepository.DuplicateErrorMessage,UserRepository.contactField,newUser.getContact()));
		}
		if(!userRepo.findByMailId(newUser.getMailId()).isEmpty()) {
			throw new DuplicateException(String.format(UserRepository.DuplicateErrorMessage,UserRepository.mailIdField,newUser.getMailId()));
		}
		Users savedUser = userRepo.save(newUser);
		return UserMapper.setResponseData(savedUser);
	}

	@Override
	public List<HashMap<String, Object>> getAllUser() {
			List<Users> allUser=userRepo.findAll();
			return allUser.stream().map(Users->UserMapper.setResponseData(Users)).collect(Collectors.toList());
		
	}

	public HashMap<String, Object> getUser(Long id) {
		// TODO Auto-generated method stub
		return UserMapper.setResponseData(userRepo.findById(id).orElseThrow(()->new RuntimeExceptions(String.format("Resource not found for id : %s",id))));
		
	}
	
	@Override
	public HashMap<String, Object> updateUser(Long Id,UserDto userDto) throws DuplicateException {
 		Users updateUser = UserMapper.maptoUser(userDto);
 		
 		Users getRecord=userRepo.findById(Id).orElseThrow(()->new RuntimeExceptions(String.format("Resource not found for id : %s",Id)));
		getRecord=UserMapper.userUpdateFields(getRecord, updateUser);
		
		try {
		Users savedUser = userRepo.save(getRecord);
		return UserMapper.setResponseData(savedUser);
		}catch (Exception e) {
			if(e instanceof DataIntegrityViolationException)
				throw new RuntimeExceptions(String.format("EmailId or Contact Numeber is aleready exist with another account "));
		return null;
		}
		
	}

	@Override
	public String deleteUser(Long id) {
		userRepo.findById(id).orElseThrow(()->new RuntimeExceptions(String.format("Id %s not found in system",id)));
		userRepo.deleteById(id);
		return String.format("Record successfully Removed for Id : %s",id);
	}

	@Override
	public HashMap<String, Object> validateUser(String username,String password) throws Exception {
		
		Users getRecord =userRepo.findByUsernameAndPassword(username,password).orElseThrow(()->new RuntimeExceptions(String.format("Username %s not found in system",username)));
		return UserMapper.setResponseData(getRecord);
		// TODO Auto-generated method stub
	}
}
