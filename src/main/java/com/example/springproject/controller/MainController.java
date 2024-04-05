package com.example.springproject.controller;

import com.example.springproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private Integer port;

    @PostMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "Duy Quyền") String name) {
        return String.format("Hello %s", name);
    }

}
