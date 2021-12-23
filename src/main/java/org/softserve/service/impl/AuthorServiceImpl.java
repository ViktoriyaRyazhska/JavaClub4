package org.softserve.service.impl;

import org.softserve.model.Author;
import org.softserve.repository.AuthorRepository;
import org.softserve.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {


    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author create(Author author) {
        return authorRepository.saveAuthor(author);
    }

    @Override
    public Author readById(int id) {
        return authorRepository.read(id);
    }

    @Override
    public Author update(Author author) {
        return authorRepository.update(author);
    }

    @Override
    public void delete(int id) {
        authorRepository.delete(id);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }
}
