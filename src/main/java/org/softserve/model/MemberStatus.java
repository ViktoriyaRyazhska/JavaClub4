package org.softserve.model;

import javax.persistence.*;

@Entity
@Table(name = "member_status")
public class MemberStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "status_value")
    private String status_value;


    public MemberStatus() {
    }

    public int getId() {
        return id;
    }

    public String getStatus_value() {
        return status_value;
    }

    public void setStatus_value(String status_value) {
        this.status_value = status_value;
    }

    @Override
    public String toString() {
        return "Member_status{" +
                "id=" + id +
                ", status_value='" + status_value + '\'' +
                '}';
    }
}
