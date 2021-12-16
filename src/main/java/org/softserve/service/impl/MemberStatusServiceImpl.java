package org.softserve.service.impl;

import org.softserve.model.MemberStatus;
import org.softserve.repository.impl.MemberStatusRepositoryImpl;
import org.softserve.service.MemberStatusService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberStatusServiceImpl implements MemberStatusService {

    @Autowired
    private MemberStatusRepositoryImpl memberStatusRepository;


    @Override
    public MemberStatus create(MemberStatus memberStatus) {
        return memberStatusRepository.create(memberStatus);
    }

    @Override
    public MemberStatus readById(int id) {
        return memberStatusRepository.read(id);
    }

    @Override
    public void update(MemberStatus memberStatus) {
        memberStatusRepository.update(memberStatus);
    }

    @Override
    public void delete(MemberStatus memberStatus) {
        memberStatusRepository.delete(memberStatus);
    }

    @Override
    public List<MemberStatus> getAll() {
        return memberStatusRepository.findAll();
    }
}
