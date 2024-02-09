package com.services;

import com.model.User;

public interface AdminService {
	
	public User createUser (User u);
	
	public void deleteUser(String employeeId);


}
