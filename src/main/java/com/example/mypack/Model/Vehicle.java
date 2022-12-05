package com.example.mypack.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles", schema = "public", catalog = "mypack")
public class Vehicle {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int vehicle_id;
    private String matricule;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;
    @OneToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    public Vehicle() {
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
