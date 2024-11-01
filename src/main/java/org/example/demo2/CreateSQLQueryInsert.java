package org.example.demo2;

import ConnectionToDB.HibernateConnTODb;
import org.hibernate.query.Query;

import java.io.Serializable;

public class CreateSQLQueryInsert extends HibernateConnTODb implements Serializable {
    public static void main(String[] args) {
        try{
            session.beginTransaction();
            String sqlQuery="Insert into User (username,lastname) values (:name,:last) ";
            Query query=session.createQuery(sqlQuery);
            query.setParameter("name","admin");
            query.setParameter("last","admin1");
            query.executeUpdate();
            session.getTransaction().commit();

        }
        finally {
            session.close();
        }
    }
}
