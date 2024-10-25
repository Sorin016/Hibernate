package org.example.demo2;

import ConnectionToDB.ConnTODb;
import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;

public class PostDataToDB extends ConnTODb implements Serializable  {
    public static void main(String[] args) {
        try{
            User user=new User("Maia","Popkina",78996);
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
            System.out.println("DONEEEEE!!!!!!!!!!!!!!!!!!!!!!!");
        }
        finally {
            sessionFactory.close();
        }


//        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("UU");
//        EntityManager entityManager=entityManagerFactory.createEntityManager();
//        EntityTransaction transaction=entityManager.getTransaction();
//        try {
//            transaction.begin();
//            User user=new User("DAVID","LAZAR",54321);
//            entityManager.persist(user);
//        }
//       finally {
//            if(transaction.isActive())transaction.rollback();
//        }
//        String jdbcURL="jdbc:mysql://127.0.0.1:3306/hibernate";
//        String user="root";
//        String password="Password1";
//        try {
//            Connection connection= DriverManager.getConnection(jdbcURL,user,password);
//            System.out.println("CONECTAREEEEEEEEEEE");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
