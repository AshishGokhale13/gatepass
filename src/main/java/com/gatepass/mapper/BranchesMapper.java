package com.gatepass.mapper;

import com.gatepass.dto.BranchesDto;
import com.gatepass.model.Branches;

public class BranchesMapper {

	public static Branches mapToBranches(BranchesDto obj)
	{
		return new Branches(obj.getId(),obj.getBranch());
	}


	public static BranchesDto mapToBranchesDto(Branches saveStandards) {
		// TODO Auto-generated method stub
		return new BranchesDto(saveStandards.getId(),saveStandards.getBranch());
	}
}
