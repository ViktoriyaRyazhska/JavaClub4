package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.dao.AuthorDAO;
import com.team1.spring_hibernate.dao.BookDAO;
import com.team1.spring_hibernate.entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorDAO authorDAO;

    @Override
    @Transactional
    public List<Author> getAllAuthor() {
        return authorDAO.getAllAuthor();
    }

    @Override
    public void saveAuthor(Author author) {

    }

    @Override
    public Author getAuthorByID(int id) {
        return null;
    }

    @Override
    public void deleteAuthorByID(int id) {

    }

    @Override
    public Author getAuthorByName(String name) {
        return null;
    }
}
