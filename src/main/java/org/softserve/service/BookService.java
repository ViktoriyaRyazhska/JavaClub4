package org.softserve.service;

import org.softserve.model.Book;

import java.util.List;

public interface BookService {

    Book create(Book book);

    Book readById(int id);

    void update(Book book);

    void delete(int id);

    List<Book> getAll();
}
