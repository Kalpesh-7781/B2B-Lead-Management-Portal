package com.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
    private UserRepository userRepository;

    @Override
    public User findByEmployeeId(String employeeId) {
        return userRepository.findByEmployeeId(employeeId);
    }

	@Override
	public void updatePassword(String employeeId,String password, String newPassword) {
		User user = userRepository.findByEmployeeId(employeeId);
        if (user != null) {
            user.setPassword(newPassword);
            userRepository.save(user);
		
	}

	}
} 
        
