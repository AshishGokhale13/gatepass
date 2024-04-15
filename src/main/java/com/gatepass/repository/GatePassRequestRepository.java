package com.gatepass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatepass.model.GatePassRequest;

public interface GatePassRequestRepository extends JpaRepository<GatePassRequest,Long>{

}
