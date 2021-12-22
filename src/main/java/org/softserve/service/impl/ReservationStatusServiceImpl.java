package org.softserve.service.impl;

import org.softserve.model.ReservationStatus;
import org.softserve.repository.ReservationStatusRepository;
import org.softserve.service.ReservationStatusService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationStatusServiceImpl implements ReservationStatusService {

    private ReservationStatusRepository reservationStatusRepository;

    @Autowired
    public ReservationStatusServiceImpl(ReservationStatusRepository reservationStatusRepository) {
        this.reservationStatusRepository = reservationStatusRepository;
    }

    @Override
    public ReservationStatus create(ReservationStatus reservationStatus) {
        return reservationStatusRepository.create(reservationStatus);
    }

    @Override
    public ReservationStatus readById(int id) {
        return reservationStatusRepository.read(id);
    }

    @Override
    public void update(ReservationStatus reservationStatus) {
        reservationStatusRepository.update(reservationStatus);
    }

    @Override
    public void delete(int id) {
        reservationStatusRepository.delete(id);
    }

    @Override
    public List<ReservationStatus> getAll() {
        return reservationStatusRepository.findAll();
    }
}
