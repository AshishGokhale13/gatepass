package com.gatepass.dto;

import org.springframework.web.multipart.MultipartFile;

import com.gatepass.model.Branches;
import com.gatepass.model.Standards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

Long id;
String enrollNo;
String name;
String dob;
Standards standard;
Branches branch;
String email;
String mobile;
String password;
String profile;
MultipartFile profileFile;


public StudentDto(Long id, String enrollNo, String name, String dob, Standards standard, Branches branch, String email,
		String mobile, String password, String profile) {
	super();
	this.id = id;
	this.enrollNo = enrollNo;
	this.name = name;
	this.dob = dob;
	this.standard = standard;
	this.branch = branch;
	this.email = email;
	this.mobile = mobile;
	this.password = password;
	this.profile = profile;
}
}
