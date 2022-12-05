package com.example.mypack.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "admins", schema = "public", catalog = "mypack")
public class Admin extends Personne
{

    @OneToMany (targetEntity = Manager.class, mappedBy = "admin")
    private List<Manager> managers = new ArrayList<>();

    public Admin() {
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }
}
