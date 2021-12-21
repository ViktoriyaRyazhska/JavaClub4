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
    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public void create(Author author) {
        authorRepository.saveAuthor(author);
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
