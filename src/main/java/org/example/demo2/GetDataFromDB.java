package org.example.demo2;

import ConnectionToDB.ConnTODb;
import entity.User;

import java.io.Serializable;
import java.util.stream.Stream;

public class GetDataFromDB extends ConnTODb implements Serializable {
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
