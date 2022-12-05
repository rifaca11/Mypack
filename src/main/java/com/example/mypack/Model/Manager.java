package com.example.mypack.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "managers", schema = "public", catalog = "mypack")
public class Manager extends Personne {

    @ManyToOne
    @JoinColumn (name = "admin_id", nullable = false)
    private Admin admin;
    @OneToOne
    @JoinColumn (name = "center_id", nullable = false)
    private Center center;
    @ManyToMany
    @JoinTable (name = "T_manager_box_associations",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "box_id"))
    private List<Box> boxes = new ArrayList<>();

    public Manager() {
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}
