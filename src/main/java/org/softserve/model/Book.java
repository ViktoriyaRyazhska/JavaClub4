package org.softserve.model;


import org.hibernate.Session;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title", nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "publication_date")
    private LocalDateTime publication_date;

    @Column(name = "copies_owned")
    private int copies_owned;

    @ManyToMany(mappedBy = "books")
    Set<Author> authors = new HashSet<>();


    public Book() {
    }

    public Book(String title, Category category, LocalDateTime publication_date, int copies_owned) {
        this.title = title;
        this.category = category;
        this.publication_date = publication_date;
        this.copies_owned = copies_owned;
        authors = new HashSet<>();
    }

    public Book(String title, Category category, LocalDateTime publication, Integer copies) {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(LocalDateTime publication_date) {
        this.publication_date = publication_date;
    }

    public int getCopies_owned() {
        return copies_owned;
    }

    public void setCopies_owned(int copies_owned) {
        this.copies_owned = copies_owned;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publication_date=" + publication_date +
                ", copies_owned=" + copies_owned +
                ", authors=" + authors +
                '}';
    }
}
