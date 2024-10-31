package org.example.demo2.JPAExamples;

import entity.User;

import static ConnectionToDB.JPAConnToDB.entityManager;

public class  CreateConnectionWithDBWithJPAPersistenceFile {
    public static void main(String[] args) {
        entityManager.getTransaction().begin();
        User user=entityManager.find(User.class,3);
        System.out.println(user);
    }
}
