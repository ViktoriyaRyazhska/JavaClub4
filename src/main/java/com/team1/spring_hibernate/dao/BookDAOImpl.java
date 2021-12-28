package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.Book;
import com.team1.spring_hibernate.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<Book> getAllBook() {
        Session session = sessionFactory.getCurrentSession();
        List<Book> allBooks = session.createQuery("from Book", Book.class).getResultList();
        return allBooks;
    }

    @Override
    public void saveBook(Book book) {

    }

    @Override
    public Book getBookByID(int id) {
        return null;
    }

    @Override
    public void deleteBookByID(int id) {

    }

    @Override
    public Book getBookByTitle(String name) {
        return null;
    }

    @Override
    public Book getAllBooksIfAvailable(int id) {
        return null;
    }

    @Override
    public int getBooksReadingNowByUser(int id) {
        return 0;
    }
}
