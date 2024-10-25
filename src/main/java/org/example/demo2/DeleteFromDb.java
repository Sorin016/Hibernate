 package org.example.demo2;

import ConnectionToDB.ConnTODb;

import java.io.Serializable;

public class DeleteFromDb extends ConnTODb implements Serializable {
    public static void main(String[] args) {
        try {
            session.beginTransaction();

            session.createQuery("delete from  User where id=11").executeUpdate();

            session.getTransaction().commit();
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
