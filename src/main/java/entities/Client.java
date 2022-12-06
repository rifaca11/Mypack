package entities;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "client")
public class Client extends Person {

    @OneToMany (targetEntity = Box.class, mappedBy = "clients")
    private List<Box> boxes = new ArrayList<>();

    public Client() {
    }

    public List<Box> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<Box> boxes) {
        this.boxes = boxes;
    }
}

