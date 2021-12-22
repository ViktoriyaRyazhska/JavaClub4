package org.softserve.service.impl;

import org.softserve.model.Reservation;
import org.softserve.repository.ReservationRepository;
import org.softserve.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReservationServiceImpl implements ReservationService {


    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationServiceImpl(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation create(Reservation reservation) {
        return reservationRepository.create(reservation);
    }

    @Override
    public Reservation readById(int id) {
        return reservationRepository.read(id);
    }

    @Override
    public void update(Reservation reservation) {
        reservationRepository.update(reservation);
    }

    @Override
    public void delete(int id) {
        reservationRepository.delete(id);
    }

    @Override
    public List<Reservation> getAll() {
        return reservationRepository.findAll();
    }
}
