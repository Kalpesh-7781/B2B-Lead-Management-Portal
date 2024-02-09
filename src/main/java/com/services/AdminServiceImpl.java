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
		return userRepository.save(u);
	}

	@Override
	public void deleteUser(String employeeId) {
		User user = userRepository.findByEmployeeId(employeeId);
		if (user != null) {
            userRepository.delete(user);
        }
	}
	
	
	
	
	
	
	
	
	

}
