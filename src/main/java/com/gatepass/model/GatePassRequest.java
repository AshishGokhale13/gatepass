package com.gatepass.model;

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
public class GatePassRequest {

	@Id
	Long id;
	
	Student studentid;
	
	String requestMessage;
	
	String requestDate;
	
	Long approverId;
	
	String approvedBy;
	
	String approvedTime;
	
	String requestCreatedDate;
	
}
