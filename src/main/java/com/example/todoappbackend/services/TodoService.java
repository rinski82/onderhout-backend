package com.example.todoappbackend.services;

import com.example.todoappbackend.model.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface TodoService extends
        CrudRepository<Todo, Integer>
{
    @Query("select t from todo t order by t.duedate ASC, t.priority ASC, t.plannedtype DESC")
    Iterable<Todo> findAll();

    @Query("select t from todo t where t.id = :id")
    Iterable<Todo> findById(@Param("id") int id);

    @Query("select t from todo t where t.owner = :owner_id")
    Iterable<Todo> findByOwnerId(@Param("owner_id") int owner_id);

    @Query("select t from todo t where t.duedate = :selected_date")
    Iterable<Todo> findByDuedate(@Param("selected_date") Date selected_date);
}

