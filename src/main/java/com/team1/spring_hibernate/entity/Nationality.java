package com.team1.spring_hibernate.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "nationality")
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nationality")
    private String nationality;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Author> authors = new HashSet<>();

    public Nationality(){}

    public Nationality(int id, String nationality) {
        this.id = id;
        this.nationality = nationality;
    }

    // -------------------------Book loan-------------------------------------
    @OneToMany(mappedBy = "nationality")
    private Set<Author> author = new HashSet<Author>();

    public Set<Author> getAuthorss() {
        return author;
    }

    public void setAuthorss(Set<Author> author) {
        this.author = author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public void addAuthor(Author author) {
        this.author.add(author);
    }

    public void addGroup(Author author) {
        this.author.add(author);
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    // ---------------------------Book copies-----------------------------------

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


}
