package com.gatepass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatepass.model.Security;

public interface SecurityRepository extends JpaRepository<Security, Long> {

}
