package com.example.mypack.Model;

import jakarta.persistence.*;

@Entity
@Table (name = "center", schema = "public", catalog = "mypack")
public class Center {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int center_id;
    @Basic
    @Column (name = "center_name")
    private String center_name;

    public Center() {
    }

    public int getCenter_id() {
        return center_id;
    }

    public void setCenter_id(int center_id) {
        this.center_id = center_id;
    }

    public String getCenter_name() {
        return center_name;
    }

    public void setCenter_name(String center_name) {
        this.center_name = center_name;
    }
}
