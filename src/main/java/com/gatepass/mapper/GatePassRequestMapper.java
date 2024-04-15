package com.gatepass.mapper;

import com.gatepass.dto.GatePassRequestDto;
import com.gatepass.model.GatePassRequest;

public class GatePassRequestMapper {

	public static GatePassRequest toGatePassRequest(GatePassRequestDto obj)
	{
		return new GatePassRequest(obj.getId(),obj.getStudentid(),obj.getRequestMessage(),obj.getRequestDate(),obj.getApproverId(),obj.getApprovedBy(),obj.getApprovedTime(),obj.getRequestCreatedDate());
		
	}
	
	public static GatePassRequestDto toGatePassRequestDTO(GatePassRequest obj)
	{
		return new GatePassRequestDto(obj.getId(),obj.getStudentid(),obj.getRequestMessage(),obj.getRequestDate(),obj.getApproverId(),obj.getApprovedBy(),obj.getApprovedTime(),obj.getRequestCreatedDate());
		
	}
}
