package dto;

import entity.PassportOneToOne;
import entity.PersonOneToOne;


public record PersonsWithPassports(
        PersonOneToOne person,
        PassportOneToOne passport
) {
}
