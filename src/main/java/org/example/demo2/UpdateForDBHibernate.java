package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;

import java.io.Serializable;

public class UpdateForDBHibernate extends HibernateConnTODb implements Serializable {
    public static void main(String[] args) {
        try {
            session.beginTransaction();
            // metoda1
//            Query query = session.createNativeQuery("UPDATE hibernate.userhiber SET password = 23445 WHERE id=11");
//            query.executeUpdate();
            //metoda2
            session.createQuery("update User set password = 5 where id=10").executeUpdate();

            session.getTransaction().commit();
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        } finally {
            sessionFactory.close();
        }
    }
}
