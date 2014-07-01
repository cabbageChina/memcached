package com.xiaobai.memcached.dao;

import com.xiaobai.memcached.model.User;

public interface IUserDao {
	
	public int add(User user);
	
	public int remove(int id);
	
	public void update(User user);
	
	public User find(String id);
}
