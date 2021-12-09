package org.softserve.service;

import org.softserve.model.Author;

import java.util.List;

public interface AuthorService {
    Author create(Author author);
    Author readById(int id);
    Author update(Author author);
    void delete(int id);
    List<Author> getAll();
}
