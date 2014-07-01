package com.xiaobai.memcached.dao;

import java.io.IOException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.command.BinaryCommandFactory;
import net.rubyeye.xmemcached.utils.AddrUtil;

import org.junit.Before;
import org.junit.Test;

import com.xiaobai.memcached.model.User;

public class UseDaoImplTest2 {

	MemcachedClientBuilder builder;
	MemcachedClient client;

	@Before
	public void before() throws IOException {
		builder = new XMemcachedClientBuilder(
				AddrUtil.getAddresses("192.168.162.129:11111"));
		builder.setFailureMode(true);
		builder.setCommandFactory(new BinaryCommandFactory());

		builder.setConnectionPoolSize(1);

		client = builder.build();
	}

	@Test
	public void add() throws Exception {
		User user = new User(10, 100, "lisi");
		boolean flag = client.set("user:id:10",0, user);
		System.out.println(flag);
	}

	@Test
	public void find() {
		try {

			User user = (User) client.get("user:id:1");
			System.out.println(user.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
