package com.gatepass.services;

import java.util.List;

import com.gatepass.dto.VectorDto;
import com.gatepass.dto.Rector.RectorDto;

public interface VectorServices {

	String vectorRootPath="E:/stsproject/gatepass/src/main/resources/static/images/vectors/";
	RectorDto saveVector(VectorDto obj);
	List<RectorDto>  getRector();
}
