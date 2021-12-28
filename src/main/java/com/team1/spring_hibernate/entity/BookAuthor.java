package com.team1.spring_hibernate.entity;

import com.team1.spring_hibernate.entity.*;


import javax.persistence.*;
import java.util.Arrays;


@Entity
@Table(name = "book_author")
public class BookAuthor {

    private int id;


    private Author author;
    private Book book;
    // additional fields

    @Column(name = "is_coauthor")
    private boolean is_coauthor;

    public BookAuthor() {
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // --------------------------------------------------------------

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    public Book getBook() {

        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    public boolean getIs_coauthor() {
        return is_coauthor;
    }

    public void setIs_coauthor(boolean is_coauthor) {
        this.is_coauthor = is_coauthor;
    }


    // --------------------------------------------------------------

}
