package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Author;
import org.softserve.model.Book;
import org.softserve.repository.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    @Override
    public void update(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(book);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(book);
        t1.commit();
        session.close();
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = (List<Book>) HibernateUtil.getSessionFactory().openSession().createQuery("From Book ").list();
        return books;
    }
}
