package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Category;
import org.softserve.repository.CategoryRepository;

import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    @Override
    public Category create(Category category) {
        return null;
    }

    @Override
    public Category read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Category.class, id);
    }

    @Override
    public void update(Category category) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(category);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(Category category) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(category);
        t1.commit();
        session.close();
    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = (List<Category>) HibernateUtil.getSessionFactory().openSession().createQuery("From Category ").list();
        return categories;
    }

}
