package com.gatepass.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gatepass.customeOps.CustomOperations;
import com.gatepass.dto.VectorDto;
import com.gatepass.dto.Rector.RectorDto;
import com.gatepass.mapper.VectorMapper;
import com.gatepass.model.Vector;
import com.gatepass.repository.VectorRepository;
import com.gatepass.services.VectorServices;

@Service
public class VectorServicesImpl implements VectorServices {

	VectorRepository VectorRepo;

	public VectorServicesImpl(VectorRepository vectorRepo) {
		super();
		VectorRepo = vectorRepo;
	}
	
	
	public RectorDto saveVector(VectorDto obj)
	{
		String filePath=CustomOperations.getNewFilePath(CustomOperations.createNewDirectoryPath(vectorRootPath),obj.getProfileFile().getOriginalFilename());
		obj.setProfile(CustomOperations.getDirPath(filePath,"static"));
		Vector vector=VectorMapper.mapperTOVector(obj);
		vector=VectorRepo.save(vector);
		CustomOperations.saveFile(obj.getProfileFile(), filePath);
		return  VectorMapper.mapperTORectorDto(vector);
	}


	@Override
	public List<RectorDto> getRector() {
		List<Vector> v=VectorRepo.findAll();
		return v.stream().map(t->VectorMapper.mapperTORectorDto(t)).collect(Collectors.toList());
	}

	

}
