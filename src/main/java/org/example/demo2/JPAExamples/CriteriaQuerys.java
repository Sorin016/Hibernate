package org.example.demo2.JPAExamples;

import ConnectionToDB.JPAConnToDB;
import entity.PersonOneToOne;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.io.Serializable;

public class CriteriaQuerys extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try{
            entityManager.getTransaction().begin();
            CriteriaBuilder cb = entityManager.getCriteriaBuilder();
            CriteriaQuery<PersonOneToOne> criteriaQuery=cb.createQuery(PersonOneToOne.class);
            Root<PersonOneToOne> customRoot=criteriaQuery.from(PersonOneToOne.class);
            criteriaQuery.select(customRoot); //Select c from PersonOneToOne c
            TypedQuery<PersonOneToOne> query=entityManager.createQuery(criteriaQuery);
            query.getResultList().forEach(System.out::println);
            entityManager.getTransaction().commit();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }
}
