package com.zensar.services;

import org.springframework.stereotype.Service;

import com.zensar.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public boolean validateUser(User user) {
		if(user.getUsername().equals("Sudhanya") && user.getPassword().equals("welcome")) {
			return true;
	}else {

	return false;
	
	}
		
	}

}
