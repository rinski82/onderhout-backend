package com.example.todoappbackend.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity(name="todo")
//@JsonIgnoreProperties({ "id" })
public class Todo {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String task;
    String category;
    String priority;
    //@ManyToOne
    //@JsonManagedReference(value = "owner")
    String owner;
    String due;
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

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getPriority() { return priority; }

    public void setPriority(String priority) { this.priority = priority; }

    public String getOwner() { return owner; }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDue() { return due; }

    public void setDue(String due) { this.due = due; }

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


}