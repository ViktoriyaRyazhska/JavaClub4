package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.Author;
import com.team1.spring_hibernate.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDAOImpl implements AuthorDAO {


    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Author> getAllAuthor() {
        Session session = sessionFactory.getCurrentSession();
        List<Author> allAuthors = session.createQuery("from Author", Author.class).getResultList();
        return allAuthors;
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
