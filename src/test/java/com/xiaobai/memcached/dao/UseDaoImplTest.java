package com.xiaobai.memcached.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xiaobai.memcached.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:applicationContext-ssm.xml","classpath*:simplesm-context.xml"})
public class UseDaoImplTest {
	
	@Resource
	private IUserDao userDao;
	
	//@Test
	public void add() {
		User user = new User();
		user.setId(1);
		user.setAge(20);
		user.setName("zhangsan");
		userDao.add(user);
	}

	public void remove() {
		
	}

	public void update() {
		
	}

	@Test
	public void find() {
		
		User user = userDao.find("1");
		System.out.println(user.getId());
		System.out.println(user.getName());
	}

	
}
