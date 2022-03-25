package com.multiplex.service;

import com.multiplex.entity.Users;

public interface UserService {

	Users fetchUserByEmailId(String tempEmailId);

	Users saveUser(Users user);

	Users fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass);

	public Users getUserByEmail(String email);

}
