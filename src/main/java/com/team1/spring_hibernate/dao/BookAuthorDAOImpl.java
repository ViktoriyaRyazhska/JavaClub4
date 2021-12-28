package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.Book;
import com.team1.spring_hibernate.entity.BookAuthor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.*;


@Repository
public class BookAuthorDAOImpl implements BookAuthorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<BookAuthor> getAllBookAuthor() {
        Session session = sessionFactory.getCurrentSession();
        List<BookAuthor> list = session.createQuery("from BookAuthor", BookAuthor.class).getResultList();
        return list;
    }
}
