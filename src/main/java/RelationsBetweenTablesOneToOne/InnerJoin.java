package RelationsBetweenTablesOneToOne;

import ConnectionToDB.JPAConnToDB;

import jakarta.persistence.TypedQuery;

import java.io.Serializable;

public class InnerJoin extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try {
            entityManager.getTransaction().begin();
            TypedQuery<Object[]> createInnerJoin = entityManager
                    .createQuery("""
                            select per,passport from PersonOneToOne per,PassportOneToOne passport 
                            where per.id=passport.id""", Object[].class);

            createInnerJoin.getResultList().forEach(e-> System.out.println(e[0]+" "+e[1]));


            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

}
