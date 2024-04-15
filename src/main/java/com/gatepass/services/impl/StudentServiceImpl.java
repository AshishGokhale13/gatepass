package com.gatepass.services.impl;


import org.springframework.stereotype.Service;

import com.gatepass.customeOps.CustomOperations;
import com.gatepass.dto.StudentDto;
import com.gatepass.mapper.StudentMapper;
import com.gatepass.model.Student;
import com.gatepass.repository.StudentRepository;
import com.gatepass.services.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices {

	StudentRepository studentRepo;
	
	public StudentServiceImpl(StudentRepository studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public StudentDto addStudent(StudentDto obj) {
		String filePath=CustomOperations.getNewFilePath(CustomOperations.createNewDirectoryPath(stuentRootPath),obj.getProfileFile().getOriginalFilename());
		obj.setProfile(CustomOperations.getDirPath(filePath,"static"));
		 Student student=StudentMapper.toStudent(obj);
		try {
			student=studentRepo.save(student);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		CustomOperations.saveFile(obj.getProfileFile(), filePath);
		return  StudentMapper.toStudentDTO(student);
	}

	
}
