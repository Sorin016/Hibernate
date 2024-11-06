package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

@NamedQueries(
        @NamedQuery(name = "getAllDataFromPersonEntity",
        query = """
select p from PersonOneToOne p""")
)
public class PersonOneToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nume;

    @OneToOne(cascade = CascadeType.PERSIST)
    private PassportOneToOne passportOneToOne;
}
