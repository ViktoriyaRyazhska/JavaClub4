package com.team1.spring_hibernate.entity;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    Set<Author> booksAuthors;

    @Column(name = "copies_count")
    private int copies_count;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private double rating;

    @Column(name = "edition")
    private String edition;

    @Column(name = "is_available")
    private boolean is_available;




    public Book() {
    }

    public Book(int id, int copies_count, String title, double rating, String edition, boolean is_available) {
        this.id = id;
        this.copies_count = copies_count;
        this.title = title;
        this.rating = rating;
        this.edition = edition;
        this.is_available = is_available;
    }


    public Set<Author> getBooksAuthors() {
        return booksAuthors;
    }

    public void setBooksAuthors(Set<Author> booksAuthors) {
        this.booksAuthors = booksAuthors;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCopies_count() {
        return copies_count;
    }

    public void setCopies_count(int copies_count) {
        this.copies_count = copies_count;
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
