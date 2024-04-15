package com.gatepass.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gatepass.dto.BranchesDto;
import com.gatepass.mapper.BranchesMapper;
import com.gatepass.model.Branches;
import com.gatepass.repository.BranchesRepository;
import com.gatepass.services.BranchesSerivces;

@Service
public class BrachesServicesImpl implements BranchesSerivces{

	BranchesRepository branchRepo;
	
	
	public BrachesServicesImpl(BranchesRepository branchRepo) {
		super();
		this.branchRepo = branchRepo;
	}

	@Override
	public BranchesDto saveBranch(BranchesDto obj) {
		Branches st=BranchesMapper.mapToBranches(obj);
		Branches saveStandards=branchRepo.save(st);
		return BranchesMapper.mapToBranchesDto(saveStandards);
		
	}

	@Override
	public List<BranchesDto> allBranches() {
		List<Branches> getBranches=branchRepo.findAll();
		
		return getBranches.stream().map((Standards)->BranchesMapper.mapToBranchesDto(Standards)).collect(Collectors.toList());
	
	}

}
