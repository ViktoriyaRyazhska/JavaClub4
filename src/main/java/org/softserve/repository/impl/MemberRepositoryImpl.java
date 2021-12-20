package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Member;
import org.softserve.repository.MemberRepository;

import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {
    @Override
    public Member create(Member member) {
        return null;
    }

    @Override
    public Member read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(Member.class, id);
    }

    @Override
    public void update(Member member) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(member);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(Member member) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(member);
        t1.commit();
        session.close();
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = (List<Member>) HibernateUtil.getSessionFactory().openSession().createQuery("From Member").list();
        return members;
    }

    private Member requestNeededBook() {
        return (Member) HibernateUtil.getSessionFactory().openSession().createQuery(
                "select title, first_name, last_name from  book as c inner join book_author ba on c.id=ba.book_id");
    }
}
