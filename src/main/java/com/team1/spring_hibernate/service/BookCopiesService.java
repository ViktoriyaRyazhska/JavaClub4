package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.entity.BookCopies;
import com.team1.spring_hibernate.entity.BookLoan;

import java.util.List;

public interface BookCopiesService {

    public List<BookCopies> getAllBookCopy();
}
