package org.softserve.repository;

import org.softserve.model.Reservation;

import java.util.List;

public interface ReservationRepository {
    Reservation create(Reservation reservation);

    Reservation read(int id);

    void update(Reservation reservation);

    void delete(int id);

    List<Reservation> findAll();
}
