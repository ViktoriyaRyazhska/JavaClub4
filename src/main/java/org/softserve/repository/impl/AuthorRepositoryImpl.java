package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Author;
import org.softserve.repository.AuthorRepository;

import java.util.List;

public class AuthorRepositoryImpl implements AuthorRepository {

    private final Session session;

    public AuthorRepositoryImpl(SessionFactory sessionFactory, Session session) {
        this.session = session;
    }

//    @Override
//    public void savetAuthor(Author author) {
////        Transaction transaction = null;
////        Session session = HibernateUtil.
////                getSessionFactory().
////                openSession();
////        transaction = session.beginTransaction();
////        session.save(author);
////        transaction.commit();
//    }

    @Override
    public Author saveAuthor(Author author) {
        if (author.getId() == 0) {
            session.persist(author);
        } else author = (Author) session.merge(author);
        return author;
    }

    @Override
    public Author read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Author.class, id);
    }

    @Override
    public void update(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(author);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(author);
        t1.commit();
        session.close();
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors = (List<Author>) HibernateUtil.getSessionFactory().openSession().createQuery("From Author").list();
        return authors;
    }
}
