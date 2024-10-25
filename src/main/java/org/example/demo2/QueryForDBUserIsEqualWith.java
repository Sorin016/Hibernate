package org.example.demo2;

import ConnectionToDB.ConnTODb;
import entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

public class QueryForDBUserIsEqualWith extends ConnTODb implements Serializable {
    public static void main(String[] args) {
        try {
            session.beginTransaction();
            List<User> userList = session.createQuery("from User where username like '%o%'").list();
            Stream<User> stream = userList.stream();
            Stream<User> stream1 = userList.stream();
            stream.filter(e-> e.getUsername().equals("sorin")).forEach(System.out::println);
            int id=stream1.findFirst().get().getUsername().equals("sorin")?1:0;
            if(id==1)
                System.out.println("CORECT!!!!");
            session.getTransaction().commit();
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
