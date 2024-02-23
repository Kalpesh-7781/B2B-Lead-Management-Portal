package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value ="/login")
    public ResponseEntity<?>login(@RequestBody User user) {
        User existingUser = userService.findByEmployeeId(user.getEmployeeId());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
        	return ResponseEntity.ok("Login Successful!");
        } else {
        	return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid Credentials!");
        }
    }

    @PutMapping("/updatePassword")
    public ResponseEntity<?> updatePassword(@RequestParam String employeeId,@RequestParam String password, @RequestParam String newPassword) {
    	User user = userService.findByEmployeeId(employeeId);
    	if (user != null && user.getPassword().equals(password)) {
            userService.updatePassword(employeeId,password, newPassword);
            return ResponseEntity.ok("Password updated successfully!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid employee ID or current password!");
        }
    }
    
    @PostMapping("/leads")
    public Lead createLead(@RequestBody Lead lead) {
        return leadService.createLead(lead);
    }
}
