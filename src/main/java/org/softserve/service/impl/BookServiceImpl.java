package org.softserve.service.impl;

import org.softserve.model.Book;
import org.softserve.repository.BookRepository;
import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
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
