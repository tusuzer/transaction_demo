package com.transaction.service.impl;


import com.transaction.entity.User;
import com.transaction.mapper.UserMapper;
import com.transaction.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@EnableTransactionManagement
@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;

	public User getUserById(int userId) {
		return this.userMapper.getUserById(userId);
	}

	@Transactional
	public void addUser(User user) throws Exception {
		userMapper.insertUser(user);
		System.out.println(user);
		userMapper.insertUser(user);
		System.out.println(user);
		//throw new Exception();
	}

}
