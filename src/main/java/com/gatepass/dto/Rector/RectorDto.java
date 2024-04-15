package com.gatepass.dto.Rector;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RectorDto {
	Long Id;
	String name;
	String mobile;
	String email;
	Date   dob;
	String adhar;
	String pan;
	String profile;
}
