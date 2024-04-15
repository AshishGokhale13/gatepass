package com.gatepass.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatepass.model.Users;

public interface UserRepository extends JpaRepository<Users,Long> {
	final String DuplicateErrorMessage="Acconut already exist with given %s : %s";
	final String IdNotFound="ID '%s' not exist in System";
	final String contactField="contact";
	final String mailIdField="mailId";
	
	Optional<Users> findByContact(String contact);
	Optional<Users> findByMailId(String mailId);
	Optional<Users> findByUsernameAndPassword(String username,String password);
	
}
