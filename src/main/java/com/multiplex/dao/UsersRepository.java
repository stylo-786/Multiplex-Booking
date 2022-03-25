package com.multiplex.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multiplex.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	public Users findByEmailId(String emailId);
	public Users findByEmailIdAndPassward(String emailId,String passward);
	
}