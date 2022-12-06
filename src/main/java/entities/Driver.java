package entities;

import jakarta.persistence.*;


import java.util.List;

@Entity
@Table(name = "driver")
public class Driver extends Person {
    @OneToMany(targetEntity = Box.class, mappedBy = "drivers")
    private List<Box> boxList;


    public Driver() {
    }

    public List<Box> getboxList() {
        return boxList;
    }

    public void setBoxList(List<Box> boxList) {
        this.boxList = boxList;
    }
}
