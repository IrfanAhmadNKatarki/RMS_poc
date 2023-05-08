package com.rms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.rms.dao.UserDao;
import com.rms.model.Login;
import com.rms.model.User;

public class UserServiceImpl implements UserService {

	  @Autowired
	  public UserDao userDao;

	

	  @Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userDao.register(user);
	}

	  @Override
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return userDao.validateUser(login);	
	}

	}