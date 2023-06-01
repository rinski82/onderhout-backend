package com.example.todoappbackend.controllers;

import com.example.todoappbackend.model.User;
import com.example.todoappbackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    User save(@RequestBody User user) {
        return userService.save(user);
    }

    @GetMapping("/user")
    Iterable<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    Iterable<User> findUser(@PathVariable int id) {
        return userService.findById(id);
    }

    @DeleteMapping("/user/{id}")
    void delete(@PathVariable int id) {
        userService.deleteById(id);
    }
}
