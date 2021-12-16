package org.softserve.repository;

import org.softserve.model.ReservationStatus;

import java.util.List;

public interface ReservationStatusRepository {
    ReservationStatus create(ReservationStatus reservationStatus);

    ReservationStatus read(int id);

    void update(ReservationStatus reservationStatus);

    void delete(ReservationStatus reservationStatus);

    List<ReservationStatus> findAll();
}
