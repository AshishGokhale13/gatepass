package com.gatepass.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gatepass.dto.StandardsDto;
import com.gatepass.mapper.StandardsMapper;
import com.gatepass.model.Standards;
import com.gatepass.repository.StandardsRepository;
import com.gatepass.services.StandardsServices;

@Service
public class standardsServiceImpl implements StandardsServices {

	StandardsRepository repo;
	
	public standardsServiceImpl(StandardsRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public StandardsDto saveStandard(StandardsDto obj) {
		Standards st=StandardsMapper.mapTOStandards(obj);
		Standards saveStandards=repo.save(st);
		return StandardsMapper.mapTOStandardsDto(saveStandards);
	}
	

	@Override
	public List<StandardsDto> getStandard() {
		
		List<Standards> getStandards=repo.findAll();
		
		return getStandards.stream().map((Standards)->StandardsMapper.mapTOStandardsDto(Standards)).collect(Collectors.toList());
	}

}
