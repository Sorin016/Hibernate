package RelationsBetweenTablesOneToOne;

import ConnectionToDB.JPAConnToDB;
import entity.PasswordOneToOne;
import entity.PersonOneToOne;

import java.io.Serializable;

public class Main extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try{
            entityManager.getTransaction().begin();
            PersonOneToOne personOneToOne = new PersonOneToOne();
            personOneToOne.setNume("sorea");

            PasswordOneToOne passwordOneToOne = new PasswordOneToOne();
            passwordOneToOne.setPasswordNumber("AC112321");
            personOneToOne.setPasswordOneToOne(passwordOneToOne);

            entityManager.persist(personOneToOne);
            // se poate de facut asa sau de pus     @OneToOne(cascade = CascadeType.PERSIST) la
            //bucata de cod care ai nevoe pentru a face legatura
           // entityManager.persist(passwordOneToOne);

            entityManager.getTransaction().commit();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

}