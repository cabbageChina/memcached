package com.xiaobai.memcached.dao;


import org.springframework.stereotype.Repository;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughSingleCache;
import com.xiaobai.memcached.model.User;

@Repository("userDao")
public class UserDaoImpl implements IUserDao{
	
	@Override
	@ReadThroughSingleCache(namespace="id",expiration=30)
	public int add(User user) {
		System.out.println(user);
		return 1;
	}
	
	@Override
	public int remove(int id) {
		return 0;
	}

	@Override
	public void update(User user) {
		
	}

	@ReadThroughSingleCache(namespace="user:id",expiration=60)
	@Override
	public User find(@ParameterValueKeyProvider String id) {
		User user = new User();
		user.setId(1);
		user.setName("zhangsan");
		user.setAge(20);
		return user;
	}
	
}
