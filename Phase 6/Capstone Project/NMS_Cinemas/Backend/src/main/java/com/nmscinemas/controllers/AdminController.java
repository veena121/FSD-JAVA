package com.nmscinemas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nmscinemas.services.AdminService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path="/myapi/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/")
	public String adminLogin(@RequestParam String name, @RequestParam String password)
	{
		if(adminService.verifyAdmin(name, password))
		{
			return "Login Successfull";
		}
		else
		{
			return "Login Failed";
		}
	}
}
