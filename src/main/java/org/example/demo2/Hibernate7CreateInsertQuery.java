package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;

import java.io.Serializable;


public class Hibernate7CreateInsertQuery extends HibernateConnTODb implements Serializable {
    public static void main(String[] args) {

        try {
            session.beginTransaction();
            session.createMutationQuery("UPDATE User u SET u.username = :email WHERE u.id = :id")
                    .setParameter("email", "soreaAA")
                    .setParameter("id", 18)
                    .executeUpdate();

            session.getTransaction().commit();
        } finally {
            session.close();
        }
    }
}
