package com.gatepass.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	Long id;
	String instituteName;
	String contact;
	String mailId;
	String address;
	String city;
	String postalCode;
	String state;
	String username;
	String password;
}
