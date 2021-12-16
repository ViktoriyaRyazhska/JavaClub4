package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Author;
import org.softserve.repository.AuthorRepository;

public class AuthorRepositoryImpl implements AuthorRepository {
    @Override
    public Author create(Author author) {
        return null;
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
}
