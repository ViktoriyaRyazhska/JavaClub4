package org.softserve.model;

import javax.persistence.*;

@Entity
@Table(name = "reservation_status")
public class ReservationStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status_value")
    private String status_value;
}
