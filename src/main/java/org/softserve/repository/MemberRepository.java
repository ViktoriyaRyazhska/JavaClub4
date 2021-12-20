package org.softserve.repository;

import org.softserve.model.Member;

import java.util.List;

public interface MemberRepository {
    Member create(Member member);

    Member read(int id);

    void update(Member member);

    void delete(Member member);

    List<Member> findAll();

}
