package com.gatepass.mapper;

import com.gatepass.dto.StudentDto;
import com.gatepass.model.Student;


public class StudentMapper {

	public static Student toStudent(StudentDto obj)
	{
		return new Student(obj.getId(),obj.getEnrollNo(),obj.getName(),obj.getDob(),obj.getStandard(),obj.getBranch(),obj.getEmail(),obj.getMobile(),obj.getPassword(),obj.getProfile());
	}
	
	public static StudentDto toStudentDTO(Student student)
	{
		return new StudentDto(student.getId(),student.getEnrollNo(),student.getName(),student.getDob(),student.getStandard(),student.getBranch(),student.getEmail(),student.getMobile(),student.getPassword(),student.getProfile());
	}
	
}
