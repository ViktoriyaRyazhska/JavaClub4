package org.softserve.repository.impl;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.softserve.HibernateUtil;
import org.softserve.model.Reservation;
import org.softserve.repository.ReservationRepository;

import java.util.List;

public class ReservationRepositoryImpl implements ReservationRepository {
    @Override
    public Reservation create(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation read(int id) {
    return HibernateUtil.getSessionFactory().openSession().get(Reservation.class, id);
    }

    @Override
    public void update(Reservation reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(reservation);
        t1.commit();
        session.close();
    }

    @Override
    public void delete(Reservation reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t1 = session.beginTransaction();
        session.update(reservation);
        t1.commit();
        session.close();
    }

    @Override
    public List<Reservation> findAll() {
        List<Reservation> reservations = (List<Reservation>) HibernateUtil.getSessionFactory().openSession().createQuery("From Reservation").list();
        return reservations;
    }
}
