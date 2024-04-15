package com.gatepass.services.impl;

import org.springframework.stereotype.Service;

import com.gatepass.customeOps.CustomOperations;
import com.gatepass.dto.SecurityDto;
import com.gatepass.mapper.SecurityMapper;
import com.gatepass.model.Security;
import com.gatepass.repository.SecurityRepository;
import com.gatepass.services.SecurityServices;

@Service
public class SecurityServiceImpl implements SecurityServices {

	SecurityRepository securityRepo;
	
	public SecurityServiceImpl(SecurityRepository securityRepo) {
		super();
		this.securityRepo = securityRepo;
	}

	@Override
	public SecurityDto addSecurity(SecurityDto obj) {
		String filePath=CustomOperations.getNewFilePath(CustomOperations.createNewDirectoryPath(securityRootPath),obj.getProfileFile().getOriginalFilename());
		obj.setProfile(CustomOperations.getDirPath(filePath,"static"));
		Security securityGaurd=SecurityMapper.toSecurity(obj);
		try {
			securityGaurd=securityRepo.save(securityGaurd);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		CustomOperations.saveFile(obj.getProfileFile(), filePath);
		return  SecurityMapper.toSecurityDTO(securityGaurd);
	}

}
