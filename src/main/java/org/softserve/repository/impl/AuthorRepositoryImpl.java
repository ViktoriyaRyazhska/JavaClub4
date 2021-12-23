package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Author;
import org.softserve.repository.AuthorRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AuthorRepositoryImpl implements AuthorRepository {

    @PersistenceContext
    private EntityManager entityManager;


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

    @Transactional
    @Override
    public Author saveAuthor(Author author) {
        if (author.getId() == 0) {
            entityManager.persist(author);
        } else author = (Author) entityManager.merge(author);
        return author;
    }

    @Override
    public Author read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Author.class, id);
    }

    @Override
    public Author update(Author author) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(author);
        t1.commit();
        session.close();
        return author;
    }

    @Override
    public void delete(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(id);
        t1.commit();
        session.close();
    }

    @Override
    public List<Author> findAll() {
        List<Author> authors = (List<Author>) HibernateUtil.getSessionFactory().openSession().createQuery("From Author").list();
        return authors;
    }
}
