package ConnectionToDB;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.io.Serializable;

public class JPAConnToDB implements Serializable {
    public static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("PersistenceExample");
    public static EntityManager entityManager =
            entityManagerFactory.createEntityManager();
}
