package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
    private UserRepository userRepository;

	@Override
	public User createUser(User u) {
		// TODO Auto-generated method stub
		return userRepository.save(u);
	}
	
	
	
	
	
	
	

}
