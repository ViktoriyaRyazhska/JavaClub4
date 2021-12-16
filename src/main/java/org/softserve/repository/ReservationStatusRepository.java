package org.softserve.repository;

import org.softserve.model.ReservationStatus;

public interface ReservationStatusRepository {
    ReservationStatus create(ReservationStatus reservationStatus);

    ReservationStatus read(int id);

    void update(ReservationStatus reservationStatus);

    void delete(ReservationStatus reservationStatus);
}
