package org.softserve.service;

import org.softserve.model.Author;
import org.softserve.model.Book;

import java.util.List;

public interface AuthorService {
    Author create(Author author, Book book);

    Author readById(int id);

    Author update(Author author);

    void delete(int id);

    List<Author> getAll();
}
