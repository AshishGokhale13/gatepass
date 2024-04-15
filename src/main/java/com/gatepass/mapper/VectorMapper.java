package com.gatepass.mapper;

import com.gatepass.dto.VectorDto;
import com.gatepass.dto.Rector.RectorDto;
import com.gatepass.dto.Rector.RectorNamesDto;
import com.gatepass.model.Vector;

public class VectorMapper {

	public static Vector mapperTOVector(VectorDto obj) {
		return new Vector(obj.getId(), obj.getName(), obj.getMobile(), obj.getEmail(), obj.getDob(), obj.getAdhar(),
				obj.getPan(), obj.getProfile(), obj.getUsername(), obj.getPassword());
	}

	public static VectorDto mapperTOVectorDto(Vector obj) {
		return new VectorDto(obj.getId(), obj.getName(), obj.getMobile(), obj.getEmail(), obj.getDob(), obj.getAdhar(),
				obj.getPan(), obj.getProfile(), obj.getUsername(), obj.getPassword());
	}
	
	
	public static RectorDto mapperTORectorDto(Vector obj) {
		return new RectorDto(obj.getId(), obj.getName(), obj.getMobile(), obj.getEmail(), obj.getDob(), obj.getAdhar(),
				obj.getPan(), obj.getProfile());
	}
	
	public static RectorNamesDto mapperTORectorNameDto(Vector obj) {
		return new RectorNamesDto(obj.getId(),obj.getName());
				}
	
	
}
