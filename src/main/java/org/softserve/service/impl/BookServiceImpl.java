package org.softserve.service.impl;

import org.softserve.model.Book;
import org.softserve.repository.impl.BookRepositoryImpl;
import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepositoryImpl bookRepository;

    public BookServiceImpl() {

    }

    @Override
    public Book create(Book book) {
        return bookRepository.create(book);
    }

    @Override
    public Book readById(int id) {
        return bookRepository.read(id);
    }

    @Override
    public void update(Book book) {
        bookRepository.update(book);
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);

    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
