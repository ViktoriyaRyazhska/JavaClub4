package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.dao.BookAuthorDAO;
import com.team1.spring_hibernate.entity.BookAuthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;

@Service
public class BookAuthorServiceImpl implements BookAuthorService{

    @Autowired
    BookAuthorDAO bookAuthorDAO;

    @Override
    @Transactional
    public List<BookAuthor> getAllBookAuthor() {
        return bookAuthorDAO.getAllBookAuthor();
    }
}
