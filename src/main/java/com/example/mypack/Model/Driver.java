package com.example.mypack.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "drivers", schema = "public", catalog = "mypack")
public class Driver extends Personne{

    @OneToMany (targetEntity = Box.class, mappedBy = "driver")
    private List<Box> boxes = new ArrayList<>();

    public Driver() {
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}
