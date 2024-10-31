package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;
import entity.User;

import java.io.Serializable;

public class GetDataFromDBHibernate extends HibernateConnTODb implements Serializable {
    public static void main(String[] args) {

        try {
            session.beginTransaction();
            User user = session.get(User.class, 10);
            session.getTransaction().commit();
            System.out.println(user);
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
