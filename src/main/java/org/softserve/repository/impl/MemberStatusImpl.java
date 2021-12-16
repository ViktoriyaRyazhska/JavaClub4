package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.MemberStatus;
import org.softserve.repository.MemberStatusRepository;

import java.util.List;

public class MemberStatusImpl implements MemberStatusRepository {
    @Override
    public MemberStatus create(MemberStatus memberStatus) {
        return null;
    }

    @Override
    public MemberStatus read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(MemberStatus.class, id);
    }

    @Override
    public void update(MemberStatus memberStatus) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(memberStatus);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(MemberStatus memberStatus) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(memberStatus);
        t1.commit();
        session.close();
    }

    @Override
    public List<MemberStatus> findAll() {
        List<MemberStatus> memberStatuses = (List<MemberStatus>) HibernateUtil.getSessionFactory().openSession().createQuery("From MemberStatus").list();
        return memberStatuses;
    }
}
