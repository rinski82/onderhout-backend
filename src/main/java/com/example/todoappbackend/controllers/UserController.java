package com.example.todoappbackend.controllers;

import com.example.todoappbackend.model.Todo;
import com.example.todoappbackend.model.User;
import com.example.todoappbackend.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    User save(@Valid @RequestBody User user) {
        if (user.getUsername() != null)
            return userService.save(user);
        else
            throw new IllegalArgumentException("user not valid");
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
