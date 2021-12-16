package org.softserve.service.impl;

import org.softserve.model.Member;
import org.softserve.repository.MemberRepository;
import org.softserve.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberServiceImpl implements MemberService {


    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member create(Member member) {
        return memberRepository.create(member);
    }

    @Override
    public Member readById(int id) {
        return memberRepository.read(id);
    }

    @Override
    public void update(Member member) {
        memberRepository.update(member);
    }

    @Override
    public void delete(Member member) {
        memberRepository.delete(member);
    }

    @Override
    public List<Member> getAll() {
        return memberRepository.findAll();
    }
}
