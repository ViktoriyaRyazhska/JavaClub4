package org.softserve.service.impl;

import org.softserve.model.Author;
import org.softserve.model.Book;
import org.softserve.service.AuthorService;
import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {

    private BookService bookService;

    @Autowired
    public AuthorServiceImpl(BookService bookService){
        this.bookService = bookService;
    }

    @Override
    public Author create(Author author, Book book) {
        return null;
    }

    @Override
    public Author readById(int id) {
        return null;
    }

    @Override
    public Author update(Author author) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Author> getAll() {
        return null;
    }
}
