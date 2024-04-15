package com.gatepass.services;

import java.util.List;

import com.gatepass.dto.StandardsDto;


public interface StandardsServices {
StandardsDto saveStandard(StandardsDto obj);
List<StandardsDto> getStandard();
}
