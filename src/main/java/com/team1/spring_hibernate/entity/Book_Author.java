package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "book_author")
public class Book_Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "book_author",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    Set<Book> writtenBooks;

    @Column(name = "is_coauthor")
    private boolean is_coauthor;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Book> getWrittenBooks() {
        return writtenBooks;
    }

    public void setWrittenBooks(Set<Book> writtenBooks) {
        this.writtenBooks = writtenBooks;
    }

    public boolean isIs_coauthor() {
        return is_coauthor;
    }

    public void setIs_coauthor(boolean is_coauthor) {
        this.is_coauthor = is_coauthor;
    }

}
