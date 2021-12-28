package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    Set<Author> booksAuthors;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<BookCopies> booksCopies = new HashSet<>();

    @ManyToMany
    Set<User> booksLoans;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private double rating;

    @Column(name = "edition")
    private String edition;


    // ------------------------------Book author--------------------------------

    @OneToMany(mappedBy = "book")
    private Set<BookAuthor> bookAuthors = new HashSet<BookAuthor>();

    //@OneToMany(mappedBy = "book")
    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }

    public void setBookAuthor(Set<BookAuthor> bookAuthor) {
        this.bookAuthors = bookAuthors;
    }

    public void addBookAuthor(BookAuthor bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    public void addGroup(BookAuthor bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    public Set<Author> getBooksAuthors() {
        return booksAuthors;
    }

    public void setBooksAuthors(Set<Author> booksAuthors) {
        this.booksAuthors = booksAuthors;
    }

    // -------------------------Book loan-------------------------------------
    @OneToMany(mappedBy = "book")
    private Set<BookLoan> bookLoans = new HashSet<BookLoan>();

    public Set<BookLoan> getBookLoans() {
        return bookLoans;
    }

    public void setBookLoans(Set<BookLoan> bookLoans) {
        this.bookLoans = bookLoans;
    }

    public void setBookLoan(Set<BookLoan> bookLoan) {
        this.bookLoans = bookLoan;
    }

    public void addBookLoans(BookLoan bookLoans) {
        this.bookLoans.add(bookLoans);
    }

    public void addLoans(BookLoan bookLoans) {
        this.bookLoans.add(bookLoans);
    }

    public Set<User> getBooksLoans() {
        return booksLoans;
    }

    public void setBooksLoans(Set<User> booksLoans) {
        this.booksLoans = booksLoans;
    }

    // ---------------------------Book copies-----------------------------------
    @OneToMany(mappedBy = "book")
    private Set<BookCopies> bookCopies = new HashSet<BookCopies>();

    public Set<BookCopies> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(Set<BookCopies> bookCopies) {
        this.bookCopies = bookCopies;
    }

    public void setBookCopy(Set<BookCopies> bookCopies) {
        this.bookCopies = bookCopies;
    }

    public void addBookCopies(BookCopies bookCopies) {
        this.bookCopies.add(bookCopies);
    }

    public void addCopies(BookCopies bookCopies) {
        this.bookCopies.add(bookCopies);
    }

    public Set<BookCopies> getBooksCopies() {
        return booksCopies;
    }

    public void setBooksCopies(Set<BookCopies> booksCopies) {
        this.booksCopies = booksCopies;
    }

    // --------------------------------------------------------------


    public Book() {
    }

    public Book(int id, int copies_count, String title, double rating, String edition, boolean is_available) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.edition = edition;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }
}
