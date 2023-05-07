package com.rms.dao;

import com.rms.model.Login;
import com.rms.model.User;

public interface UserDao {


	  int register(User user);

	  User validateUser(Login login);
	
}
