package org.softserve.repository;


import org.softserve.model.MemberStatus;

public interface MemberStatusRepository {
    MemberStatus create(MemberStatus memberStatus);

    void read(int id);

    void update(MemberStatus memberStatus);

    void delete(int id);
}
