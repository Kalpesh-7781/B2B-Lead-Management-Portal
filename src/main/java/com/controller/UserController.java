package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.model.Lead;
import com.model.User;
import com.services.LeadService;
import com.services.UserService;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private LeadService leadService;

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
    
    @PostMapping("/leads")
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }
}
