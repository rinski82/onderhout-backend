package com.example.todoappbackend.services;

import com.example.todoappbackend.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TodoService extends
        CrudRepository<Todo, Integer>
{
    @Query("select t from todo t where t.id = :id")
    Iterable<Todo> findById(@Param("id") int id);

    @Query("select t from todo t where t.owner = :owner_id")
    Iterable<Todo> findByOwnerId(@Param("owner_id") int owner_id);

    // save(Todo todo)
    // Iterable<Todo> findAll()
    // deleteById(int id)
}