package com.example.todoappbackend.model;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

@Entity(name="todo")
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    @NotBlank
    String task;
    Boolean plannedtype;
    String context;
    String priority;
    String owner;
    @ManyToOne
    User user;
    Date duedate;
    String locationxy;
    String description;
    String status;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTask() {
        return task;
    }
    public void setTask(String task) {
        this.task = task;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public String getOwner() { return owner; }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public Date getDuedate() { return duedate; }
    public void setDuedate(Date duedate) { this.duedate = duedate; }
    public String getLocationxy() { return locationxy; }
    public void setLocationxy(String locationxy) { this.locationxy = locationxy; }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Boolean getPlannedtype() {
        return plannedtype;
    }
    public void setPlannedtype(Boolean plannedtype) {
        this.plannedtype = plannedtype;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}