package org.softserve.service;

import org.softserve.model.MemberStatus;

import java.util.List;

public interface MemberStatusService {

    MemberStatus create(MemberStatus memberStatus);

    MemberStatus readById(int id);

    void update(MemberStatus memberStatus);

    void delete(int id);

    List<MemberStatus> getAll();
}
