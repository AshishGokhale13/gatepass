package com.gatepass.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

@Id
Long id;
String enrollNo;
String name;
String dob;

@OneToOne
Standards standard;
@OneToOne
Branches branch;

String email;
String mobile;
String password;
String profile;

}
