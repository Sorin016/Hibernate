package org.example.demo2;

import ConnectionToDB.ConnTODb;
import entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

public class QueryForDBMaxId extends ConnTODb implements Serializable {
    public static void main(String[] args) {
        try {
            session.beginTransaction();
            List<User> userList=session.createQuery("from User").list();
            Stream<User> stream=userList.stream();
            int s=stream.map(e->e.getId()).map(Integer::valueOf).max(Integer::compareTo).orElse(0);
            System.out.println(s);
            session.getTransaction().commit();
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
