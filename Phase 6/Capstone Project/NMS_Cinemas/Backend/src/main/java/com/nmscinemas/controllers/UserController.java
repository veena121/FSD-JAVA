package com.nmscinemas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmscinemas.services.UserService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/myapi/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public String UserLogin(@RequestParam String username, @RequestParam String password)
	{
		if(userService.verifyUser(username, password))
		{
			return "Login Successfull";
		}
		else
		{
			return "Login Failed";
		}
	}
}
