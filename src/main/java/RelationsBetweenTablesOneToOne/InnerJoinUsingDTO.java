package RelationsBetweenTablesOneToOne;

import ConnectionToDB.JPAConnToDB;
import dto.PersonsWithPassports;
import jakarta.persistence.TypedQuery;

import java.io.Serializable;

public class InnerJoinUsingDTO extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try {
            entityManager.getTransaction().begin();
            TypedQuery<PersonsWithPassports> createInnerJoin = entityManager
                    .createQuery("""
                            select new dto.PersonsWithPassports(per,passport) from PersonOneToOne per,PassportOneToOne passport 
                            where per.id=passport.id""", PersonsWithPassports.class);

            createInnerJoin.getResultList().forEach(e-> System.out.println(e.passport()  +" "+e.person()));


            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
