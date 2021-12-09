package org.softserve.service;

import org.softserve.model.Reservation;

import java.util.List;

public interface ReservationService {

    Reservation create(Reservation reservation);

    Reservation readById(int id);

    Reservation update(Reservation reservation);

    void delete(int id);

    List<Reservation> getAll();
}
