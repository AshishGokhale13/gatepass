package com.gatepass.services;

import com.gatepass.dto.StudentDto;

public interface StudentServices {
	String stuentRootPath="E:/stsproject/gatepass/src/main/resources/static/images/student/";

	StudentDto addStudent(StudentDto obj);
}
