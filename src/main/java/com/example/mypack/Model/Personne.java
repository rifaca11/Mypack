package com.example.mypack.Model;

import jakarta.persistence.*;

import java.util.Objects;

@MappedSuperclass
public class Personne {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    @Basic
    @Column (name = "username")
    private String username;
    @Basic
    @Column (name = "email")
    private String email;
    @Basic
    @Column (name = "password")
    private String password;

    public Personne() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
