package com.gatepass.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable = false)
	String instituteName;

	@Size(min=10,max=10,message = "no number")
	@Column(nullable = false,unique = true)
	String contact;

	@Column(nullable = false,unique = true)
	String mailId;

	@Column(nullable = false)
	String address;

	@Column(nullable = false)
	String city;

	@Column(nullable = false)
	String postalCode;

	@Column(nullable = false)
	String state;

	
	@Column(nullable = false)
	@JsonIgnore
	String username;

	
	@Size(min=6,message = "password lenght should be more than 6")
	@Column(nullable = false)
	@JsonIgnore
	String password;


}
