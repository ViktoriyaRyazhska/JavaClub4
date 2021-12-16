package org.softserve.repository;

import org.softserve.model.Reservation;

public interface ReservationRepository {
    Reservation create(Reservation reservation);

    Reservation read(int id);

    void update(Reservation reservation);

    void delete(Reservation  reservation);
}
