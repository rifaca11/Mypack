package entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "manager")
public class Manager extends Person {
    @ManyToOne
    @JoinColumn (name = "admin_id", nullable = false)
    private Admin admin;
    @OneToOne
    @JoinColumn (name = "center_id", nullable = false)
    private Center center;
    @ManyToMany
    @JoinTable (name = "T_manager_box_associations",
            joinColumns = @JoinColumn(name = "idPerson"),
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

