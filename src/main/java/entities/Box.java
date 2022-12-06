package entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "box")
public class Box {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long box_id;
    private String reference;
    private String categorie;
    private Double poids;
    @Enumerated(EnumType.STRING)
    private Boxstatus status;
    private String adresse_act;
    private String sending_to;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "client_id", nullable = false)
    private Client clients;

    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }

    @ManyToMany
    @JoinTable (name = "T_manager_box_associations",
            joinColumns = @JoinColumn(name = "box_id"),
            inverseJoinColumns = @JoinColumn(name = "idPerson"))
    private List<Manager> managers = new ArrayList<>();

    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver drivers;
    public Driver getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver drivers) {
        this.drivers = drivers;
    }



    public String getAdresse_act() {
        return adresse_act;
    }

    public void setAdresse_act(String adresse_act) {
        this.adresse_act = adresse_act;
    }
    public String getSending_to() {
        return sending_to;
    }

    public void setSending_to(String sending_to) {
        this.sending_to = sending_to;
    }

    public enum Boxstatus {
        en_cours, delivre
    }
    public Long getBox_id() {
        return box_id;
    }

    public void setBox_id(Long box_id) {
        this.box_id = box_id;
    }

    public Boxstatus getStatus() {
        return status;
    }

    public void setStatus(Boxstatus status) {
        this.status = status;
    }
    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
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


}