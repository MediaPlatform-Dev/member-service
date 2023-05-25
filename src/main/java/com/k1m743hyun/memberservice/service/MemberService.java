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
        memberRepository.save(memberMapper.toEntity(requestDto));
    }

    public MemberDto getMember(String memberId) {
        Member member = memberRepository.findById(memberId)
            .orElseThrow();
        return memberMapper.toDto(member);
    }

    public List<MemberDto> getMembers() {
        return memberRepository.findAll()
            .stream()
            .map(memberMapper::toDto)
            .toList();
    }
}