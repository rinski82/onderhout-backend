package com.example.todoappbackend.model;
import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @NotBlank
    String username;
    String password;
    String emailadres;
    String fullname;
    String initials;
    public User() {}
    public User(String username) {
        this.setUsername(username);
    }
    public User(String username, String password, String emailadres) {
        this.setUsername(username);
        this.setPassword(password);
        this.setEmailadres(emailadres);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmailadres() {
        return emailadres;
    }
    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }
    public String getFullname() { return fullname; }
    public void setFullname(String fullname) { this.fullname = fullname; }
    public String getInitials() { return initials; }
    public void setInitials(String initials) { this.initials = initials; }
}
