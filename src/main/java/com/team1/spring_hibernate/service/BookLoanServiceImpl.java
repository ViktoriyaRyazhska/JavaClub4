package com.team1.spring_hibernate.service;


import com.team1.spring_hibernate.dao.BookLoanDAO;
import com.team1.spring_hibernate.entity.BookLoan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookLoanServiceImpl implements BookLoanService{

    @Autowired
    BookLoanDAO bookLoanDAO;

    @Override
    @Transactional
    public List<BookLoan> getAllBookUser() {
        return bookLoanDAO.getAllBookUser();
    }
}
