package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.dao.BookCopiesDAO;
import com.team1.spring_hibernate.dao.BookLoanDAO;
import com.team1.spring_hibernate.entity.BookCopies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookCopiesServiceImpl implements BookCopiesService{

    @Autowired
    BookCopiesDAO bookCopiesDAO;

    @Override
    public List<BookCopies> getAllBookCopy() {
        return bookCopiesDAO.getAllBookCopy();
    }
}
