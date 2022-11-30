package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "box")
public class Box {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String reference;
    private String categorie;
    private Double poids;
    private status status;
    private String adresse_act;
    private String sending_to;


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    private Client clients;

    public Client getClients() {
        return clients;
    }

    public void setClients(Client clients) {
        this.clients = clients;
    }


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    private Manager managers;

    public Manager getManagers() {
        return managers;
    }
    public void setManagers(Manager managers) {
        this.managers = managers;
    }


    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
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

    enum status{
        en_cours, delivre
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Box.status getStatus() {
        return status;
    }

    public void setStatus(Box.status status) {
        this.status = status;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


}