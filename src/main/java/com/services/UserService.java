package com.services;

//import org.springframework.http.ResponseEntity;

import com.model.User;

public interface UserService {
	User findByEmployeeId(String employeeId);

}
