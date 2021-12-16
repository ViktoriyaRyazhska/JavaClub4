package org.softserve.repository;

import org.softserve.model.Book;

public interface BookRepository {
    Book create(Book book);

    Book read(int id);

    void update(Book book);

    void delete(Book book);
}
