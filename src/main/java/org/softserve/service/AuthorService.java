package org.softserve.service;

import org.softserve.model.Author;

import java.util.List;

public interface AuthorService {
    void create(Author author);

    Author readById(int id);

    void update(Author author);

    void delete(int id);

    List<Author> getAll();
}
