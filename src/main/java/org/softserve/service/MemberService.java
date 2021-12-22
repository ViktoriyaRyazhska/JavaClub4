package org.softserve.service;

import org.softserve.model.Member;

import java.util.List;

public interface MemberService {

    Member create(Member member);

    Member readById(int id);

    void update(Member member);

    void delete(int id);

    List<Member> getAll();
}
