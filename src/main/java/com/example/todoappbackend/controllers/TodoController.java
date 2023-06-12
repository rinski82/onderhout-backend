package com.example.todoappbackend.controllers;

import com.example.todoappbackend.model.Todo;
import com.example.todoappbackend.services.TodoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
public class TodoController {
    @Autowired
    TodoService todoService;
    @PostMapping("/todo")
    Todo save(@Valid @RequestBody Todo todo) {
        if (todo.getTask() != null)
            return todoService.save(todo);
        else
            throw new IllegalArgumentException("task not valid");
    }
    @GetMapping("/todo")
    Iterable<Todo> findAll() {
        return todoService.findAll();
    }
    @GetMapping("/todo?duedate={selected_date}")
    Iterable<Todo> findTodoByDuedate(@PathVariable Date selected_date) {
        return todoService.findByDuedate(selected_date);
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