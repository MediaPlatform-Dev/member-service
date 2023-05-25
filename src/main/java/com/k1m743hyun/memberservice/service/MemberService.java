package com.k1m743hyun.memberservice.service;

import com.k1m743hyun.memberservice.domain.dto.MemberDto;
import com.k1m743hyun.memberservice.domain.entity.Member;
import com.k1m743hyun.memberservice.domain.mapper.MemberMapper;
import com.k1m743hyun.memberservice.repository.MemberRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    @Transactional
    public void join(MemberDto requestDto) {
        Member member = memberMapper.toEntity(requestDto);
        memberRepository.save(member);
    }

    public Member getMember(String memberId) {
        return memberRepository.findById(memberId)
            .orElseThrow();
    }

    public List<Member> getMembers() {
        return memberRepository.findAll();
    }
}