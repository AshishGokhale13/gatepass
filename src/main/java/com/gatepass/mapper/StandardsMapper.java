package com.gatepass.mapper;

import com.gatepass.dto.StandardsDto;
import com.gatepass.model.Standards;

public class StandardsMapper {
	
	public static Standards mapTOStandards(StandardsDto obj)
	{
		return new Standards(obj.getId(),obj.getStandards());
	}
	
	public static StandardsDto mapTOStandardsDto(Standards obj)
	{
		return new StandardsDto(obj.getId(),obj.getStandards());
	}
	
	
	
}
