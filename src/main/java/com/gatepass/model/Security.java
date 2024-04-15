package com.gatepass.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Security {

	@Id
	Long id;
	
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	String mobile;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	Date   dob;
	@Column(nullable = false)
	String adhar;
	@Column(nullable = false)
	String pan;
	@Column(nullable = false)
	String profile;
	@Column(nullable = false)
	String username;
	@Column(nullable = false)
	String password;
	
	
}
