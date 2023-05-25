package com.k1m743hyun.memberservice.service;

import com.k1m743hyun.memberservice.domain.Member;
import com.k1m743hyun.memberservice.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    public void join(Member member) {
        memberRepository.save(member);
    }

    public Member findAMember(String memberId) {
        return memberRepository.findById(memberId)
            .orElseThrow();
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
}