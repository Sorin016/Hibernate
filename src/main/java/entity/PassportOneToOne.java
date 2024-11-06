package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class PassportOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String passwordNumber;
}
