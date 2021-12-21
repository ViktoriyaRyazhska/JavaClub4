package org.softserve.repository;

import org.hibernate.query.Query;
import org.softserve.model.Book;

import java.util.List;

public interface BookRepository {
    Book create(Book book);

    Book read(int id);

    void update(Book book);

    void delete(Book book);

    List<Book> findAll();

    List<Book> checkBook();


    Query findById(int id);

    List<Book> findByTime();
    void updateBookInformation();

    void updateBookInformantion();

    void insertBookInformation();

    void updateBookCopies();

    void deleteById();

    void GiveBookToReader();

    void setTitleOfBookAndShow();

    void GetStatisticByReader();

    void statisticByReturnedBook();

    void getStatisticByBook();

    void getStatisticByReader();

    void getListOfUnreturnedBooks();

    void HowManyBookGivenInPeriod();

    void popularBookPeriod();

    void returnBook();
}
