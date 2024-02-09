package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.services.AdminService;
import com.helper.ResponseMessage;

@RestController
@CrossOrigin(origins = "*")
public class AdminController {
	
	@Autowired
    private AdminService adminService;
	
	@Autowired
    private ResponseMessage responseMessage;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User u) {
		responseMessage.setMessage("User added successfully");
		return adminService.createUser(u);
	}
	
	@DeleteMapping("/delete/{employeeId}")
    public String deleteUser(@PathVariable String employeeId) {
        adminService.deleteUser(employeeId);
        return "User deleted successfully";
    }
	

}
