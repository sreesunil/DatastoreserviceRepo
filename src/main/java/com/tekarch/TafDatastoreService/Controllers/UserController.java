package com.tekarch.TafDatastoreService.Controllers;


import com.tekarch.TafDatastoreService.Models.Flight;
import com.tekarch.TafDatastoreService.Models.User;
import com.tekarch.TafDatastoreService.Service.FlightServiceImpl;
import com.tekarch.TafDatastoreService.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datastore/users")
public class UserController {

    @Autowired
    private UserServiceImpl datastoreService;



    // Create a new user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = datastoreService.createUser(user);
        return ResponseEntity.ok(createdUser);
    }

    // Get all users
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(datastoreService.getAllUsers());
    }



}
