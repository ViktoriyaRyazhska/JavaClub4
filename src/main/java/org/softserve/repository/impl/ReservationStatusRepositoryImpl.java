package org.softserve.repository.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.ReservationStatus;
import org.softserve.repository.ReservationStatusRepository;

public class ReservationStatusRepositoryImpl implements ReservationStatusRepository {
    @Override
    public ReservationStatus create(ReservationStatus reservationStatus) {
        return null;
    }

    @Override
    public ReservationStatus read(int id) {
        return HibernateUtil.getSessionFactory().openSession().get(ReservationStatus.class, id);
    }

    @Override
    public void update(ReservationStatus reservationStatus) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(reservationStatus);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(ReservationStatus reservationStatus) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.delete(reservationStatus);
        t1.commit();
        session.close();
    }

}
