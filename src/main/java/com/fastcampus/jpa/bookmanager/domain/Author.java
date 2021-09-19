package com.fastcampus.jpa.bookmanager.domain;

import lombok.* ;

import javax.persistence.*;
import java.util.*;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Author extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;

    @ManyToMany
    //@OneToMany
    @ToString.Exclude
    private List<Book> books = new ArrayList<>();

    public void addBook(Book... book) { // 배열로 받기
        Collections.addAll(this.books, book);
    }

}
