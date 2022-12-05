package com.example.mypack.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "boxes", schema = "public", catalog = "mypack")
public class Box {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int box_id;
    private String reference;
    private String categorie;
    private double poids;
    //enum :
    @Enumerated(EnumType.STRING)
    private BoxStatus status;
    private String current_address;
    private String sentTo;
    @ManyToMany
    @JoinTable (name = "T_manager_box_associations",
            joinColumns = @JoinColumn(name = "box_id"),
            inverseJoinColumns = @JoinColumn(name = "id"))
    private List<Manager> managers = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;
    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    public Box() {
    }

    public int getBox_id() {
        return box_id;
    }

    public void setBox_id(int box_id) {
        this.box_id = box_id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public BoxStatus getStatus() {
        return status;
    }

    public void setStatus(BoxStatus status) {
        this.status = status;
    }

    public String getCurrent_address() {
        return current_address;
    }

    public void setCurrent_address(String current_address) {
        this.current_address = current_address;
    }

    public String getSentTo() {
        return sentTo;
    }

    public void setSentTo(String sentTo) {
        this.sentTo = sentTo;
    }

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
