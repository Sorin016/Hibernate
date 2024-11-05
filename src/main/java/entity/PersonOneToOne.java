package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PersonOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nume;

    @OneToOne(cascade = CascadeType.PERSIST)
    private PasswordOneToOne passwordOneToOne;
}
