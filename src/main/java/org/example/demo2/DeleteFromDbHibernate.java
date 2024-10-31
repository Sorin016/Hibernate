 package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;

import java.io.Serializable;

public class DeleteFromDbHibernate extends HibernateConnTODb implements Serializable {
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
