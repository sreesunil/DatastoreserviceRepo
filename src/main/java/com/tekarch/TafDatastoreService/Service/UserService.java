package com.tekarch.TafDatastoreService.Service;

import com.tekarch.TafDatastoreService.Models.User;

import java.util.List;

public interface UserService {

    User createUser(User user);
    List<User> getAllUsers();
    User getUserById(Long userId);
    void deleteUser(Long userId);



}
