package org.example.demo2.JPAExamples;

import static ConnectionToDB.JPAConnToDB.entityManager;
import static ConnectionToDB.JPAConnToDB.entityManagerFactory;

public class UpdateRequest {
    public static void main(String[] args) {

        try {
            entityManager.getTransaction().begin();

            entityManager.createQuery("UPDATE User u SET u.username = :username WHERE u.id = :userId")
                    .setParameter("username", "UpdatedName")
                    .setParameter("userId", 20)
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
