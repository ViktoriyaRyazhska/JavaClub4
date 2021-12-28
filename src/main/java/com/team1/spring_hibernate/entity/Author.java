package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;


    @Column(name = "age")
    private int age;

    @ManyToOne
    private Nationality nationality;

    // --------------------------------------------------------------
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "nationality_id")
    private Set<Nationality> nationalities = new HashSet<Nationality>();


    @OneToMany(mappedBy = "author")
    private Set<BookAuthor> bookAuthors = new HashSet<BookAuthor>();


    @OneToMany(mappedBy = "author")
    public Set<BookAuthor> getBookAuthors() {
        return bookAuthors;
    }

    public void setBookAuthors(Set<BookAuthor> bookAuthors) {
        this.bookAuthors = bookAuthors;
    }


    public void addBookAuthor(BookAuthor bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    public void addGroup(BookAuthor bookAuthor) {
        this.bookAuthors.add(bookAuthor);
    }

    // --------------------------------------------------------------


    public Author() {
    }

    public Author(int id, String name, String surname,  int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    public Set<Nationality> getNationalities() {
        return nationalities;
    }

    public void setNationalities(Set<Nationality> nationalities) {
        this.nationalities = nationalities;
    }
}
