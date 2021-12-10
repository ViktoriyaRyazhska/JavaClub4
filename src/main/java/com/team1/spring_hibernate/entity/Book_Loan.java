package com.team1.spring_hibernate.entity;
import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Set;
import java.sql.*;

@Entity
@Table(name = "book_loan")
public class Book_Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "book_loan",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    Set<Book> readedBooks;

    @Column(name = "taken_date")
    private Date taken_date;

    @Column(name = "brought_date")
    private Date brought_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Book> getReadedBooks() {
        return readedBooks;
    }

    public void setReadedBooks(Set<Book> readedBooks) {
        this.readedBooks = readedBooks;
    }

    public Date getTaken_date() {
        return taken_date;
    }

    public void setTaken_date(Date taken_date) {
        this.taken_date = taken_date;
    }

    public Date getBrought_date() {
        return brought_date;
    }

    public void setBrought_date(Date brought_date) {
        this.brought_date = brought_date;
    }
}
