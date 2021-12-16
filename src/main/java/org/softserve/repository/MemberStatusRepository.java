package org.softserve.repository;


import org.softserve.model.MemberStatus;

public interface MemberStatusRepository {
    MemberStatus create(MemberStatus memberStatus);

    MemberStatus read(int id);

    void update(MemberStatus memberStatus);

    void delete(MemberStatus memberStatus);
}
