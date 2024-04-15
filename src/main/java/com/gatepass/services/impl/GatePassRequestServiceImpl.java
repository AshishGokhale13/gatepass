package com.gatepass.services.impl;

import org.springframework.stereotype.Service;

import com.gatepass.dto.GatePassRequestDto;
import com.gatepass.mapper.GatePassRequestMapper;
import com.gatepass.model.GatePassRequest;
import com.gatepass.repository.GatePassRequestRepository;
import com.gatepass.services.GatePassServiceRequest;

@Service
public class GatePassRequestServiceImpl implements GatePassServiceRequest {

	GatePassRequestRepository requestRepo;
	
	public GatePassRequestServiceImpl(GatePassRequestRepository requestRepo) {
		super();
		this.requestRepo = requestRepo;
	}

	@Override
	public GatePassRequestDto addRequest(GatePassRequestDto obj) {
		GatePassRequest requestEntity=GatePassRequestMapper.toGatePassRequest(obj);
		 requestEntity=requestRepo.save(requestEntity);
		return GatePassRequestMapper.toGatePassRequestDTO(requestEntity);	
	}

	
}
