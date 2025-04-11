package com.forexcard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forexcard.model.User;
import com.forexcard.repo.UserRepository;


@Service
public class UserRegisterService {
	
	@Autowired
	private UserRepository repo;
	
	

	public String addUser(User user) {
		if(repo.existsByEmail(user.getEmail()))
		{
			return "Email already registered";
		}
		
		repo.save(user);
		return "Register successful";
	}
	


}
