package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicule")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private type type;
    private String matricule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Vehicule.type getType() {
        return type;
    }

    public void setType(Vehicule.type type) {
        this.type = type;
    }
    enum type{
        voiture, petit_camion, grand_camion
    }
}