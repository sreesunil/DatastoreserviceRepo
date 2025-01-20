package com.tekarch.TafDatastoreService.Service;

import com.tekarch.TafDatastoreService.Models.User;
import com.tekarch.TafDatastoreService.Repositories.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }



    @Override
    public void deleteUser(Long userId) {

    }


}
