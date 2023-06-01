package com.example.todoappbackend.services;

import com.example.todoappbackend.model.Todo;
import com.example.todoappbackend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserService extends CrudRepository<User, Integer> {
    @Query("select u from users u where u.id = :id")
    Iterable<User> findById(@Param("id") int id);

}
