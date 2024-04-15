package com.gatepass.dto;

import java.sql.Date;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.gatepass.model.WardenHasArea;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class WardensDto {
	Long Id;
	String name;
	String mobile;
	String email;
	Date dob;
	String adhar;
	String pan;
	String profile;
	String username;
	String password;
	MultipartFile profileFile;
	List<WardenHasArea> wardenArea;
	public WardensDto(Long id, String name, String mobile, String email, Date dob, String adhar, String pan,
			String profile, String username, String password, List<WardenHasArea> wardenArea) {
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
		this.wardenArea = wardenArea;
	}
	
}
