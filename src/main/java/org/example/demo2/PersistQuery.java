package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;
import entity.User;

import java.io.Serializable;

public class PersistQuery extends HibernateConnTODb implements Serializable {
    public static void main(String[] args) {

    try{
        User user=new User("sorin","haros",123123);
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
    }finally{
        session.close();
    }
}
}
