package org.softserve.service;

import org.softserve.model.Author;

import java.util.List;

public interface AuthorService {
    Author create(Author author);

    Author readById(int id);

    void update(Author author);

    void delete(Author author);

    List<Author> getAll();
}
