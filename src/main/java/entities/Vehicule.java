package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicule")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicle_id;
    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;
    private String matricule;
    @OneToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    public Vehicule() {
    }

    public Long getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
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

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }


    public enum VehicleType {
        voiture, petit_camion, grand_camion;
    }
}