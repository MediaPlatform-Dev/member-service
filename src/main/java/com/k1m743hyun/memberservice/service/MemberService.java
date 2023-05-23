package com.k1m743hyun.memberservice.service;

import com.k1m743hyun.memberservice.domain.Member;
import com.k1m743hyun.memberservice.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository;

    public Member findOneMember(Long id) {
        return memberRepository.findById(id).orElseThrow();
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}