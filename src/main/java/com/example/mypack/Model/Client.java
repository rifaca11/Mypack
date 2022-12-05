package com.example.mypack.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clients", schema = "public", catalog = "mypack")
public class Client extends Personne{

    @OneToMany (targetEntity = Box.class, mappedBy = "client")
    private List<Box> boxes = new ArrayList<>();

    public Client() {
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}
