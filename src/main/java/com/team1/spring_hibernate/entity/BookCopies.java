package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "book_copies")
public class BookCopies {

    @ManyToOne
    private Book book;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_copy_id")
    private Set<Book> bookCopies = new HashSet<Book>();


    public Set<Book> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(Set<Book> bookCopies) {
        this.bookCopies = bookCopies;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    @Column(name = "is_available")
    private boolean is_available;

    public BookCopies() {
    }

    public BookCopies(int id, boolean is_available) {
        this.id = id;
        this.is_available = is_available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }
}