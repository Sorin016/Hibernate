package entity;

import jakarta.persistence.*;
//import javax.persistence.*;
  import lombok.Data;

@Entity
@Data
@Table(name = "userhiber")
public class User {

    public User(String username,String lastname, int password){
        this.username = username;
        this.lastname = lastname;
        this.password = password;
    }
    public User(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "username")
    private String username;

    @Basic
    @Column(name = "lastname")
    private String lastname;

    @Basic
    @Column(name = "password")
    private int password;


}
