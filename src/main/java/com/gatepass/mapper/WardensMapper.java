package com.gatepass.mapper;

import com.gatepass.dto.WardensDto;
import com.gatepass.model.Wardens;

public class WardensMapper {


	
	public static Wardens getWardonEntity(WardensDto w) {
	
	return new Wardens(w.getId(),w.getName(),w.getMobile(),w.getEmail(),w.getDob(),w.getAdhar(), w.getPan(), w.getProfile(),w.getUsername(), w.getPassword(),w.getWardenArea());
	
	}

	
	public static WardensDto mapToWardonDto(Wardens w) {
		
		return new WardensDto(w.getId(),w.getName(),w.getMobile(),w.getEmail(),w.getDob(),w.getAdhar(), w.getPan(), w.getProfile(),w.getUsername(), w.getPassword(), w.getWardenArea());
		
		}
	
}
