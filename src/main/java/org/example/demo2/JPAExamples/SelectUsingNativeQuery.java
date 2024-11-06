package org.example.demo2.JPAExamples;

import ConnectionToDB.JPAConnToDB;
import entity.PassportOneToOne;
import entity.PersonOneToOne;
import jakarta.persistence.Query;

import java.io.Serializable;

public class SelectUsingNativeQuery extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try{
            entityManager.getTransaction().begin();
            Query q=entityManager.createNativeQuery("Select * from hibernate.persononetoone where id =1;"
                    , PersonOneToOne.class);
            q.getSingleResult();
            System.out.println(q);
            entityManager.getTransaction().commit();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
