package com.dc.stock.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.dc.stock.core.entity.User;
public interface UserService {
	
	public List<User>  getAllusers();
	
	public User getUserById(String id);

}
