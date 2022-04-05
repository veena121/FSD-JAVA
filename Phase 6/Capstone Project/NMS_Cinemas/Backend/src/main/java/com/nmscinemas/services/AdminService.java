package com.nmscinemas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nmscinemas.entities.Admin;
import com.nmscinemas.repo.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public Boolean verifyAdmin(String name, String password)
	{
		List<Admin> admins = adminRepository.findAll();
		
		for(Admin admin : admins)
		{
			if(admin.getName().equals(name) && admin.getPassword().equals(password)) 
			{
				return true;
			}
		}
		return false;
	}
}
