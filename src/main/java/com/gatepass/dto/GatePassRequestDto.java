package com.gatepass.dto;

import com.gatepass.model.Student;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GatePassRequestDto {

	Long id;
	
	Student studentid;
	
	String requestMessage;
	
	String requestDate;
	
	Long approverId;
	
	String approvedBy;
	
	String approvedTime;
	
	String requestCreatedDate;
	
}
