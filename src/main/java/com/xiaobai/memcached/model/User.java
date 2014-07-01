package com.xiaobai.memcached.model;

import java.io.Serializable;

import com.google.code.ssm.api.CacheKeyMethod;

@SuppressWarnings("serial")
public class User implements Serializable {
	private int id;
	private int age;
	private String name;
	
	@CacheKeyMethod
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public User() {
		super();
	}

}
