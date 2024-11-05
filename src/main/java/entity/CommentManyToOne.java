package entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity @Data
public class CommentManyToOne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment;

    @ManyToOne (cascade= CascadeType.PERSIST)
    private PostManyToOne post;
}
