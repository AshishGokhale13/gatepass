package com.gatepass.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VectorDto {
	Long Id;
	String name;
	String mobile;
	String email;
	Date   dob;
	String adhar;
	String pan;
	String profile;
	String username;
	String password;
	
	MultipartFile profileFile;
	
	public VectorDto(Long id, String name, String mobile, String email, Date dob, String adhar, String pan,
			String profile, String username, String password) {
		super();
		Id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.dob = dob;
		this.adhar = adhar;
		this.pan = pan;
		this.profile = profile;
		this.username = username;
		this.password = password;

	}
	
	
	
}
