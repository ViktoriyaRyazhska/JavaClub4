package com.team1.spring_hibernate.service;

import com.team1.spring_hibernate.dao.BookDAO;
import com.team1.spring_hibernate.dao.UserDAO;
import com.team1.spring_hibernate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public List<Book> getAllBook() {
        return bookDAO.getAllBook();
    }

    @Override
    public void saveBook(Book book) {

    }

    @Override
    public Book getBookByID(int id) {
        return null;
    }

    @Override
    public void deleteBookByID(int id) {

    }

    @Override
    public Book getBookByTitle(String name) {
        return null;
    }

    @Override
    public Book getAllBooksIfAvailable(int id) {
        return null;
    }

    @Override
    public int getBooksReadingNowByUser(int id) {
        return 0;
    }
}
