package com.nmscinemas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmscinemas.entities.User;
import com.nmscinemas.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Boolean verifyUser(String username, String password)
	{
		List<User> users = userRepository.findAll();
		
		for(User user:users)
		{
			if(user.getUsername().equals(username) && user.getPassword().equals(password))
			{
				return true;
			}
		}
		return false;
	}
}
