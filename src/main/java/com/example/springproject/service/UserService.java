package com.example.springproject.service;

import com.example.springproject.model.User;
import com.example.springproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long userId) throws Exception {
        return userRepository.findById(userId).orElseThrow(() -> new Exception("User not found with ID: " + userId));
    }
}
