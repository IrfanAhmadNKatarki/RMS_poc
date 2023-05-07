package com.rms.service;

import com.rms.model.Login;
import com.rms.model.User;

public interface UserService {

	 int register(User user);

	  User validateUser(Login login);

}
