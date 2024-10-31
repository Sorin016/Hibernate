package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;
import entity.User;



import java.io.Serializable;

public class CreateSQLQuery extends HibernateConnTODb implements Serializable {
    public static void main(String[] args) {
        try{
            session.beginTransaction();
            User user = new User("maria","antuanee",1750);
            session.save(user);
            user.setLastname("Antuanete2");

            session.getTransaction().commit();

        }
        finally {
            session.close();
        }
    }
}
