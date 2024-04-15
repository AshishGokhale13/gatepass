package com.gatepass.services.impl;

import org.springframework.stereotype.Service;

import com.gatepass.customeOps.CustomOperations;
import com.gatepass.dto.WardensDto;
import com.gatepass.mapper.WardensMapper;
import com.gatepass.model.Wardens;
import com.gatepass.repository.WardensRepository;
import com.gatepass.services.WardensServices;

@Service
public class WardensServicesImpl implements WardensServices {

	WardensRepository wardenRepo;
	
	public WardensServicesImpl(WardensRepository wardenRepo) {
		super();
		this.wardenRepo = wardenRepo;
	}

	@Override
	public WardensDto addWarden(WardensDto obj) {
		String filePath=CustomOperations.getNewFilePath(CustomOperations.createNewDirectoryPath(wardensRootPath),obj.getProfileFile().getOriginalFilename());
		obj.setProfile(CustomOperations.getDirPath(filePath,"static"));
		Wardens wardens=WardensMapper.getWardonEntity(obj);
		try {
		wardens=wardenRepo.save(wardens);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		CustomOperations.saveFile(obj.getProfileFile(), filePath);
		return  WardensMapper.mapToWardonDto(wardens);
		
	}
}
