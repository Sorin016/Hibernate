package org.example.demo2;

import ConnectionToDB.ConnTODb;
import entity.User;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Stream;

public class UpdateForDB extends ConnTODb implements Serializable {
    public static void main(String[] args) {
        try {
            session.beginTransaction();
            // metoda1
//            Query query = session.createNativeQuery("UPDATE hibernate.userhiber SET password = 23445 WHERE id=11");
//            query.executeUpdate();
            //metoda2
            session.createQuery("update User set password = 9999945 where id=11").executeUpdate();

            session.getTransaction().commit();
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
