package com.gatepass.services;

import com.gatepass.dto.SecurityDto;


public interface SecurityServices {

	String securityRootPath="E:/stsproject/gatepass/src/main/resources/static/images/security/";

	SecurityDto addSecurity(SecurityDto obj);
}
