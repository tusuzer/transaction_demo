package com.transaction.service;


import com.transaction.entity.User;

public interface IUserService {
	User getUserById(int userId);

	void addUser(User user) throws Exception;

}