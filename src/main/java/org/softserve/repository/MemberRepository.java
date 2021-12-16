package org.softserve.repository;

import org.softserve.model.Member;

public interface MemberRepository {
    Member create(Member member);

    void read(int id);

    void update(Member member);

    void delete(int id);
}
