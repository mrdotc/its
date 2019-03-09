package com.dc.stock.core.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dc.stock.core.dao.UserDao;
import com.dc.stock.core.entity.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getAllusers() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public User getUserById(String idStr) {
		// TODO Auto-generated method stub
		
		User user =new User();
		
		user.setUserId(idStr);
		user.setUseName("uerName"+idStr);
	    user.setAge(18);
	    user.setEmailAddr("dmchan@hotmail.com");
	    user.setPhoneNumber("0712234324");
		
		return user;
	}

}
