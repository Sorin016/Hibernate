package org.example.demo2.JPAExamples;

import entity.User;

import static ConnectionToDB.JPAConnToDB.entityManager;
import static ConnectionToDB.JPAConnToDB.entityManagerFactory;

public class GetReferenceQuery {
    public static void main(String[] args) {
        try {
            entityManager.getTransaction().begin();

            var c = entityManager.getReference(User.class, 1);
            c.setLastname("cuc");
            System.out.println(c);
            entityManager.refresh(c);
            System.out.println(c);

            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
