package com.transaction.main;

import com.transaction.entity.User;
import com.transaction.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)        //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring/application-dao.xml"})
public class MybatisTest {
	@Resource
	private IUserService userService;

	@Test
	public void test1() {
		User user = userService.getUserById(3);
		user.setId(null);
		try {
			userService.addUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
