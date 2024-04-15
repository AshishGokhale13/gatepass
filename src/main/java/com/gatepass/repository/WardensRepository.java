package com.gatepass.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatepass.model.Wardens;

public interface WardensRepository extends JpaRepository<Wardens, Long> {

}
