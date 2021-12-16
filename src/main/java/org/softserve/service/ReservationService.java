package org.softserve.service;

import org.softserve.model.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation create(Reservation reservation);

    Reservation readById(int id);

    void update(Reservation reservation);

    void delete(Reservation reservation);

    List<Reservation> getAll();
}
