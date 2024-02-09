package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.model.User;
import com.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(@RequestBody User user) {
        User existingUser = userService.findByEmployeeId(user.getEmployeeId());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Login Successful!";
        } else {
            return "Invalid Credentials!";
        }
    }

    @PutMapping("/updatePassword")
    public String updatePassword(@RequestParam String employeeId,@RequestParam String password, @RequestParam String newPassword) {
    	User user = userService.findByEmployeeId(employeeId);
    	if (user != null && user.getPassword().equals(password)) {
            userService.updatePassword(employeeId,password, newPassword);
            return "Password updated successfully!";
        } else {
            return "Invalid employee ID or current password!";
        }
    }
}
