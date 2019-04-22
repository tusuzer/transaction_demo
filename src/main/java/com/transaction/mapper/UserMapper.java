package com.transaction.mapper;


import com.transaction.entity.User;

import javax.annotation.Resource;

@Resource
public interface UserMapper {
	User getUserById(int userId);

	Integer insertUser(User user);
}
