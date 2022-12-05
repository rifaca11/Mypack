package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "driver")
public class Driver extends Person {
    @OneToMany(mappedBy = "drivers")
    private List<Box> boxList;
    public List<Box> getboxList() {
        return boxList;
    }

    public void setBoxList(List<Box> boxList) {
        this.boxList = boxList;
    }

    @OneToOne
    private Vehicule vehicules;

    public Vehicule getVehicules() {
        return vehicules;
    }

    public void setVehicules(Vehicule vehicules) {
        this.vehicules = vehicules;
    }
}
