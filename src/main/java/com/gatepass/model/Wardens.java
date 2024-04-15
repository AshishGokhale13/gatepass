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

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Wardens {

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
	@JoinColumn(name="wardens_id", referencedColumnName = "id")
	List<WardenHasArea> wardenArea;
	
}
