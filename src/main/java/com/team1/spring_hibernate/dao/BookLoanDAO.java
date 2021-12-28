package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.BookAuthor;
import com.team1.spring_hibernate.entity.BookLoan;

import java.util.List;

public interface BookLoanDAO {

    public List<BookLoan> getAllBookUser();
}
