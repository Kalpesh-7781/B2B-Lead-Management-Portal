package com.services;

//import org.springframework.http.ResponseEntity;

import com.model.User;

public interface UserService {
	public User findByEmployeeId(String employeeId);
	
	public void updatePassword(String employeeId,String password, String newPassword);



}
