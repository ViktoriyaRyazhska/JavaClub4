package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.entity.Author;
import com.team1.spring_hibernate.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBook();

    public void saveBook(Book book);

    public Book getBookByID(int id);

    public void deleteBookByID(int id);

    public Book getBookByTitle(String name); // get Book by Title

    public Book getAllBooksIfAvailable(int id);

    public int getBooksReadingNowByUser(int id);


}
