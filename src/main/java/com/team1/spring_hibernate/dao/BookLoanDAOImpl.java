package com.team1.spring_hibernate.dao;


import com.team1.spring_hibernate.entity.BookAuthor;
import com.team1.spring_hibernate.entity.BookLoan;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class BookLoanDAOImpl implements BookLoanDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<BookLoan> getAllBookUser() {
        Session session = sessionFactory.getCurrentSession();
        List<BookLoan> list = session.createQuery("from BookLoan", BookLoan.class).getResultList();
        return list;
    }


}
