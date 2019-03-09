package com.dc.stock.core.dao;

import java.util.List;

import com.dc.stock.core.entity.User;

public interface UserDao {

	public List<User> getAllusers();
	public User getUserById(String string);
		
}
