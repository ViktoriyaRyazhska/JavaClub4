package com.team1.spring_hibernate.entity;
import javax.persistence.*;
import java.sql.*;
@Entity
@Table(name = "user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "books_readed")
    private int books_readed;

    @Column(name = "books_reading_now")
    private int reading_now;

    @Column(name = "started_reading_recently")
    private Date started_reading_recently;

    @Column(name = "ended_reading")
    private Date ended_reading;

    @Column(name = "role_id")
    private int role_id;

    public User() {
    }

    public User(int id, String name, String surname, int books_readed, int reading_now, Date started_reading_recently, Date ended_reading, int role_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.books_readed = books_readed;
        this.reading_now = reading_now;
        this.started_reading_recently = started_reading_recently;
        this.ended_reading = ended_reading;
        this.role_id = role_id;
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

    public int getBooks_readed() {
        return books_readed;
    }

    public void setBooks_readed(int books_readed) {
        this.books_readed = books_readed;
    }

    public int getReading_now() {
        return reading_now;
    }

    public void setReading_now(int reading_now) {
        this.reading_now = reading_now;
    }

    public Date getStarted_reading_recently() {
        return started_reading_recently;
    }

    public void setStarted_reading_recently(Date started_reading_recently) {
        this.started_reading_recently = started_reading_recently;
    }

    public Date getEnded_reading() {
        return ended_reading;
    }

    public void setEnded_reading(Date ended_reading) {
        this.ended_reading = ended_reading;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
