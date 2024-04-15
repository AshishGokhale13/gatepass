package com.gatepass.mapper;

import com.gatepass.dto.SecurityDto;
import com.gatepass.model.Security;

public class SecurityMapper {

public static Security toSecurity(SecurityDto obj)
{
	return new Security(obj.getId(),obj.getName(),obj.getMobile(),obj.getEmail(), obj.getDob(),obj.getAdhar(),obj.getPan(),obj.getProfile(),obj.getUsername(),obj.getPassword());
}


public static SecurityDto toSecurityDTO(Security obj)
{
	return new SecurityDto(obj.getId(),obj.getName(),obj.getMobile(),obj.getEmail(), obj.getDob(),obj.getAdhar(),obj.getPan(),obj.getProfile(),obj.getUsername(),obj.getPassword());
}


}
