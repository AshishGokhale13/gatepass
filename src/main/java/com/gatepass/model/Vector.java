package com.gatepass.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vector {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long Id;
	
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

	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="vector_id", referencedColumnName = "id")
	List<WardenHasArea> wardenArea;

	public Vector(Long id, String name, String mobile, String email, Date dob, String adhar, String pan, String profile,
			String username, String password) {
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

