package org.example.demo2.JPAExamples;

import entity.User;

import static ConnectionToDB.JPAConnToDB.entityManager;
import static ConnectionToDB.JPAConnToDB.entityManagerFactory;

public class PostRequest {
    public static void main(String[] args) {

        try {
            entityManager.getTransaction().begin();

            entityManager.createQuery("INSERT INTO User (username, lastname, password)" +
                            " VALUES (:username, :lastname, :password)")
                    .setParameter("username", "David")
                    .setParameter("lastname", "Smith")
                    .setParameter("password", 12)
                    .executeUpdate();


            entityManager.getTransaction().commit();
        } catch (Exception e) {
            // Rollback transaction if something went wrong
            if (entityManager.getTransaction().isActive()) {
                entityManager.getTransaction().rollback();
            }
            e.printStackTrace(); // Log the error for debugging
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
