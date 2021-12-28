package com.team1.spring_hibernate.entity;

import javax.persistence.*;
import java.sql.*;

@Entity
@Table(name = "book_loan")
public class BookLoan {

    private int id;

    private User user;
    private Book book;

    @Column(name = "taken_date")
    private Date taken_date;

    @Column(name = "brought_date")
    private Date brought_date;

    @Column(name = "loan_days")
    private int loan_days;

    public BookLoan() {
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
    @JoinColumn(name = "book_copy_id")
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public int getLoan_days() {
        return loan_days;
    }

    public void setLoan_days(int loan_days) {
        this.loan_days = loan_days;
    }
}
