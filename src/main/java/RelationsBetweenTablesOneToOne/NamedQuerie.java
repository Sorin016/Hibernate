package RelationsBetweenTablesOneToOne;

import ConnectionToDB.JPAConnToDB;
import entity.PassportOneToOne;


import entity.PersonOneToOne;
import jakarta.persistence.TypedQuery;
import java.io.Serializable;

public class NamedQuerie extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try {
            entityManager.getTransaction().begin();
            TypedQuery<PersonOneToOne> allPassportNumber = entityManager
                    .createNamedQuery("getAllDataFromPersonEntity", PersonOneToOne.class);

            allPassportNumber.getResultList().forEach(s-> System.out.println(s));
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
