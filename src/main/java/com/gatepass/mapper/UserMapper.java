package com.gatepass.mapper;

import java.util.HashMap;

import com.gatepass.dto.UserDto;
import com.gatepass.model.Users;

public class UserMapper {

	public static Users maptoUser(UserDto userDto) {
		return new Users(userDto.getId(),
						userDto.getInstituteName(),
						userDto.getContact(),
						userDto.getMailId(),
						userDto.getAddress(),
						userDto.getCity(),
						userDto.getPostalCode(),
						userDto.getState(),
						userDto.getUsername(),
						userDto.getPassword());
	}
	
	
	public static UserDto maptoUserDto(Users user) {
		return new UserDto(user.getId(),
						user.getInstituteName(),
						user.getContact(),
						user.getMailId(),
						user.getAddress(),
						user.getCity(),
						user.getPostalCode(),
						user.getState(),
						user.getUsername(),
						user.getPassword());
	}
	
	public static HashMap<String,Object> setResponseData(Users obj) {
		HashMap<String,Object> responseData=new HashMap<>();
		responseData.put("Id",obj.getId());
		responseData.put("instituteName",obj.getInstituteName());
		responseData.put("contact",obj.getContact());
		responseData.put("mailId",obj.getMailId());
		responseData.put("address",obj.getAddress());
		responseData.put("city",obj.getCity());
		responseData.put("postalCode",obj.getPostalCode());
		responseData.put("state",obj.getState());	
		return  responseData;
	}
	
	
	public static Users userUpdateFields(Users oldUser,Users updatedUser) {
		
		if(updatedUser.getInstituteName()!=null && !updatedUser.getInstituteName().isBlank())
		oldUser.setInstituteName(updatedUser.getInstituteName() );
		
		if(updatedUser.getContact()!=null && !updatedUser.getInstituteName().isEmpty())
			oldUser.setContact(updatedUser.getContact());
		
		if(updatedUser.getMailId()!=null && !updatedUser.getMailId().isBlank())
			oldUser.setMailId(updatedUser.getMailId());
		
		if(updatedUser.getAddress()!=null && !updatedUser.getAddress().isBlank())
			oldUser.setAddress(updatedUser.getAddress());
		
		if(updatedUser.getCity()!=null && !updatedUser.getCity().isBlank() )
			oldUser.setCity(updatedUser.getCity());
		
		if(updatedUser.getPostalCode()!=null && !updatedUser.getPostalCode().isBlank())
			oldUser.setPostalCode(updatedUser.getPostalCode());
		
		if(updatedUser.getState()!=null && !updatedUser.getState().isBlank() )
			oldUser.setState(updatedUser.getState());
		
		if(updatedUser.getUsername()!=null && !updatedUser.getUsername().isBlank())
			oldUser.setUsername(updatedUser.getUsername());
		
		if(updatedUser.getPassword()!=null  && !updatedUser.getPassword().isBlank())
			oldUser.setPassword(updatedUser.getPassword());
		
		return oldUser;
		
	}
	
	
}
