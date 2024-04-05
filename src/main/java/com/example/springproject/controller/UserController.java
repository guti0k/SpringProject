package com.example.springproject.controller;

import com.example.springproject.model.User;
import com.example.springproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<?> addUser(@RequestBody User user) {
        return ResponseEntity.ok().body(userService.addUser(user));
    }

    @RequestMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable("id") Long userId) {
        try {
            User user = userService.getUserById(userId);
            return ResponseEntity.ok().body(user);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }
}
