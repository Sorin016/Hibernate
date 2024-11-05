package RelationsBetweenTablesManyToOne;

import ConnectionToDB.JPAConnToDB;
import entity.CommentManyToOne;
import entity.PasswordOneToOne;
import entity.PersonOneToOne;
import entity.PostManyToOne;

import java.io.Serializable;

public class Main extends JPAConnToDB implements Serializable {
    public static void main(String[] args) {
        try{
            entityManager.getTransaction().begin();
            PostManyToOne post = new PostManyToOne();
            post.setTitle("instagram Sorin");
            post.setContent("fotosss");

            CommentManyToOne comment = new CommentManyToOne();
            comment.setComment("ceva legat de foto");
            comment.setPost(post);

            entityManager.persist(post);

            entityManager.getTransaction().commit();
        }
        finally {
            entityManager.close();
            entityManagerFactory.close();
        }
    }

}
