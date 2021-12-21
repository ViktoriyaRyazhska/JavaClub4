package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.softserve.HibernateUtil;
import org.softserve.model.Book;
import org.softserve.repository.BookRepository;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {
    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Book.class, id);
    }

    @Override
    public void update(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(book);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(Book book) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(book);
        t1.commit();
        session.close();
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = (List<Book>) HibernateUtil.getSessionFactory().openSession().createNativeQuery("From Book ").list();
        return books;
    }


    @Override
    public List<Book> checkBook() {
        List<Book> books = (List<Book>) HibernateUtil.getSessionFactory().openSession().createNativeQuery("select title from Book where title='Тореодори з Васюківки' and copies_owned>0").list();
        return books;
    }

    @Override
    public Query findById(int id) {
        return HibernateUtil.getSessionFactory().openSession().createNativeQuery("select title from Book where id = id");

    }

    @Override
    public List<Book> findByTime() {
        List<Book> books = (List<Book>) HibernateUtil.getSessionFactory().openSession().createNativeQuery(" select title, count(*) as count_books from book inner join reservation ba on book.id = ba.book_id where reservation_date < date('2021-12-05')and returned_date > date('2021-12-05')group by title order by count_books desc").list();
        return books;
    }

    @Override
    public void updateBookInformation() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("UPDATE public.book\n" +
                "\tSET title = ?, category_id = ?, publication_date = ?, copies_owned = ?\n" +
                "\tWHERE id = ?");


    }

    @Override
    public void updateBookInformantion() {

    }

    @Override
    public void insertBookInformation() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("INSERT INTO public.book(\n" +
                "\ttitle, category_id, publication_date, copies_owned)\n" +
                "VALUES (?, ?, ?, ?)");

    }

    @Override
    public void updateBookCopies() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("UPDATE public.book\n" +
                "\tSET copies_owned = copies_owned - 1\n" +
                "\tWHERE id = ?");
    }
    @Override
    public void deleteById() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("DELETE FROM public.book\n" +
                "WHERE id = ?\n" +
                "RETURNING *");
    }
    @Override
    public void GiveBookToReader() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("INSERT INTO public.reservation(\n" +
                "\tbook_id, member_id, reservation_date, reservation_status_id)\n" +
                "\tVALUES (4, 1, '2021-12-06', 1);\n" +
                "\t\n" +
                "UPDATE public.book\n" +
                "\tSET copies_owned = copies_owned - 1\n" +
                "\tWHERE id = 4");

    }


    @Override
    public void setTitleOfBookAndShow() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT title, copies_owned,\n" +
                "\t   CASE \n" +
                "\t   \t\tWHEN copies_owned > 0 THEN 'available' \n" +
                "\t\t\tELSE 'unavailable'\n" +
                "\t\tEND book_access\n" +
                "FROM book \n" +
                "WHERE title LIKE '%перекон%';");
    }
    @Override
    public void GetStatisticByReader() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT m.first_name || ' ' || m.last_name AS full_name,\n" +
                "\t   EXTRACT (DAY FROM AGE(NOW()::DATE, joined_date)) AS day_working_with_labrary,\n" +
                "\t   STRING_AGG(title, ' ; ' ORDER BY title) AS reading_now\n" +
                "FROM reservation r\n" +
                "JOIN member m\n" +
                "\tON r.member_id = m.id\n" +
                "JOIN book b\n" +
                "\tON b.id = r.book_id\n" +
                "WHERE m.id = 1 AND r.reservation_status_id = 1\n" +
                "GROUP BY m.id, r.reservation_status_id");
    }
    @Override
    public void statisticByReturnedBook() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT m.first_name || ' ' || m.last_name AS full_name,\n" +
                "\t   EXTRACT (DAY FROM AGE(NOW()::DATE, joined_date)) AS day_working_with_labrary,\n" +
                "\t   STRING_AGG(title, ' ; ' ORDER BY title) AS returned_book\n" +
                "FROM reservation r\n" +
                "JOIN member m\n" +
                "\tON r.member_id = m.id\n" +
                "JOIN book b\n" +
                "\tON b.id = r.book_id\n" +
                "WHERE m.id = 1 AND r.reservation_status_id = 2\n" +
                "GROUP BY m.id, r.reservation_status_id\n");
    }

    @Override
    public void getStatisticByBook() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT b.title, \n" +
                "\t   a.first_name || ' ' || a.last_name AS author,\n" +
                "\t   AVG(r.returned_date - r.reservation_date)::NUMERIC(10,0) AS avg_reading_days,\n" +
                "\t   b.copies_owned,\n" +
                "\t   CASE \n" +
                "\t   \t\tWHEN copies_owned > 0 THEN 'available' \n" +
                "\t\t\tELSE 'unavailable'\n" +
                "\t\tEND book_access\n" +
                "FROM book b\n" +
                "JOIN book_author bk\n" +
                "ON b.id = bk.book_id\n" +
                "JOIN author a\n" +
                "ON bk.author_id = a.id\n" +
                "JOIN reservation r\n" +
                "ON b.id = r.book_id\n" +
                "GROUP BY b.title, b.copies_owned, first_name, last_name\n");
    }
    @Override
    public void getStatisticByReader() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT first_name || ' ' || last_name AS full_name, email,\n" +
                "    EXTRACT (YEAR FROM AGE(NOW()::DATE,birth_date)) AS age,\n" +
                "    EXTRACT (DAY FROM AGE(NOW()::DATE, joined_date)) AS day_working_with_labrary, \n" +
                "    COUNT(member_id) AS count_of_requests\n" +
                "FROM member\n" +
                "JOIN reservation\n" +
                "ON member.id = reservation.member_id\n" +
                "WHERE reservation_date BETWEEN DATE '2021-12-01' AND DATE '2021-12-31'\n" +
                "GROUP BY first_name, last_name, email, birth_date, joined_date\n" +
                "ORDER BY age");
    }
    @Override
    public void getListOfUnreturnedBooks() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT m.first_name || ' ' || m.last_name AS full_name, m.email,\n" +
                "\t   (r.returned_date - r.reservation_date) AS total_reading_days,\n" +
                "\t   (r.returned_date - r.reservation_date) - 35 AS overdue_days,\n" +
                "\t   EXTRACT (YEAR FROM AGE(NOW()::DATE,m.birth_date)) AS age,\n" +
                "\t   m.joined_date, s.status_value\n" +
                "FROM reservation r\n" +
                "JOIN member m\n" +
                "\tON r.member_id = m.id\t\t\t\t\t   \n" +
                "JOIN member_status s\n" +
                "\tON m.active_status_id = s.id\n" +
                "WHERE (r.returned_date - r.reservation_date) > 35\t");
    }
    @Override
    public void HowManyBookGivenInPeriod() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("SELECT COUNT(id) AS total_giving_books\n" +
                "FROM reservation\n" +
                "WHERE reservation_date BETWEEN DATE '2021-09-01' AND DATE '2021-12-01'");
    }
    @Override
    public void popularBookPeriod() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("select title, count(*) as count_books from book\n" +
                "    inner join reservation ba on book.id = ba.book_id\n" +
                "where reservation_date < date('2021-12-05')\n" +
                "  and returned_date > date('2021-12-05')\n" +
                "group by title order by count_books desc");
    }
    @Override
    public void returnBook() {
        HibernateUtil.getSessionFactory().openSession().createNativeQuery("update reservation\n" +
                "set returned_date    = current_date,\n" +
                "    reservation_status_id = 2\n" +
                "where id = 1;");
    }
}