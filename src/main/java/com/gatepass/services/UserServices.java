package com.gatepass.services;

import java.util.HashMap;
import java.util.List;

import com.gatepass.dto.UserDto;
import com.gatepass.exceptionhandler.DuplicateException;

public interface UserServices {
 HashMap<String, Object> createUser(UserDto userDto) throws DuplicateException;
 List<HashMap<String, Object>> getAllUser();
 HashMap<String, Object> getUser(Long id);
 HashMap<String, Object> updateUser(Long Id,UserDto userDto) throws DuplicateException;
 HashMap<String, Object> validateUser(String username,String password) throws Exception;
 String deleteUser(Long id);
 
}
