package entities;
import jakarta.persistence.*;


@Entity
@Table(name = "manager")
public class Manager extends Person {
    @OneToOne
    private Center centers;

    public Center getCenters() {
        return centers;
    }

    public void setCenters(Center centers) {
        this.centers = centers;
    }
}

