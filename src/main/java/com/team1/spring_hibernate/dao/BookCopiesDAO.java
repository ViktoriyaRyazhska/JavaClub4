package com.team1.spring_hibernate.dao;

import com.team1.spring_hibernate.entity.BookAuthor;
import com.team1.spring_hibernate.entity.BookCopies;

import java.util.List;

public interface BookCopiesDAO {

    public List<BookCopies> getAllBookCopy();
}
