package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.softserve.HibernateUtil;
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
        List<Book> books = (List<Book>) HibernateUtil.getSessionFactory().openSession().createNativeQuery("From Book ").list();
        return books;
    }


    @Override
    public List<Book> checkBook(){
        List<Book> books = (List<Book>) HibernateUtil.getSessionFactory().openSession().createNativeQuery("select title from Book where title='Тореодори з Васюківки' and copies_owned>0").list();
        return books;
    }
    @Override
    public Query findById(int id){
       return  HibernateUtil.getSessionFactory().openSession().createNativeQuery("select title from Book where id = id");

    }

}
