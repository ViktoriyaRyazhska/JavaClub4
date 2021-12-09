package org.softserve.model;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
    @Column(name = "reservation_date")
    private LocalDateTime reservation_date;
    @Column(name = "returned_date")
    private LocalDateTime returned_date;
    @ManyToOne
    @JoinColumn(name = "reservation_status_id")
    private ReservationStatus reservationStatus;

    public Reservation() {
    }

    public int getId() {
        return id;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDateTime getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(LocalDateTime reservation_date) {
        this.reservation_date = reservation_date;
    }

    public LocalDateTime getReturned_date() {
        return returned_date;
    }

    public void setReturned_date(LocalDateTime returned_date) {
        this.returned_date = returned_date;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", book=" + book +
                ", member=" + member +
                ", reservation_date=" + reservation_date +
                ", returned_date=" + returned_date +
                ", reservationStatus=" + reservationStatus +
                '}';
    }
}
