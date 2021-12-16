package org.softserve.service;

import org.softserve.model.ReservationStatus;

import java.util.List;

public interface ReservationStatusService {

    ReservationStatus create(ReservationStatus reservationStatus);

    ReservationStatus readById(int id);

    void update(ReservationStatus reservationStatus);

    void delete(ReservationStatus reservationStatus);

    List<ReservationStatus> getAll();
}
