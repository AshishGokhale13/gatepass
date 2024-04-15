package com.gatepass.services;

import java.util.List;

import com.gatepass.dto.BranchesDto;

public interface BranchesSerivces {

	BranchesDto saveBranch(BranchesDto obj);
	List<BranchesDto> allBranches();
	
}
