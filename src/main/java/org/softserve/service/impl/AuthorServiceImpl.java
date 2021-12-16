package org.softserve.service.impl;

import org.softserve.model.Author;
import org.softserve.model.Book;
import org.softserve.repository.impl.AuthorRepositoryImpl;
import org.softserve.service.AuthorService;
import org.softserve.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepositoryImpl authorRepository = new AuthorRepositoryImpl();

    @Autowired
    public AuthorServiceImpl(){
    }

    @Override
    public Author create(Author author, Book book) {
        return null;
    }

    @Override
    public Author readById(int id) {
        return authorRepository.read(id);
    }

    @Override
    public void update(Author author) {
        authorRepository.update(author);
    }

    @Override
    public void delete(Author author) {
    authorRepository.delete(author);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
