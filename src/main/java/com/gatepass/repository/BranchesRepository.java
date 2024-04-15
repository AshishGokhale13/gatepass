package com.gatepass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatepass.model.Branches;

public interface BranchesRepository extends JpaRepository<Branches,Integer> {

}
