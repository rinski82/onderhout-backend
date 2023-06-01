package com.example.todoappbackend.controllers;

import com.example.todoappbackend.model.Todo;
import com.example.todoappbackend.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class TodoController {
    @Autowired
    TodoService todoService;
    @PostMapping("/todo")
    Todo save(@RequestBody Todo todo) {
        return todoService.save(todo);
    }
    @GetMapping("/todo")
    Iterable<Todo> findAll() {
        return todoService.findAll();
    }
    @GetMapping("/todo/{id}")
    Iterable<Todo> findById(@PathVariable int id) {
        return todoService.findById(id);
    }
    @DeleteMapping("/todo/{id}")
    void delete(@PathVariable int id) {
        todoService.deleteById(id);
    }

}