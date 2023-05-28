package com.k1m743hyun.memberservice.service;

import com.k1m743hyun.memberservice.client.OrderFeignClient;
import com.k1m743hyun.memberservice.domain.dto.MemberDto;
import com.k1m743hyun.memberservice.domain.dto.OrderDto;
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

    private final MemberRepository repository;
    private final MemberMapper mapper;
    private final OrderFeignClient feignClient;

    @Transactional
    public void createMember(MemberDto dto) {
        repository.save(mapper.toEntity(dto));
    }

    public MemberDto getMember(String id) {

        Member entity = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Couldn't find memberId: " + id));
        return mapper.toDto(entity);
    }

    public List<MemberDto> getMembers() {
        return repository.findAll()
            .stream()
            .map(mapper::toDto)
            .toList();
    }

    @Transactional
    public void deleteMember(MemberDto dto) {
        repository.delete(mapper.toEntity(dto));
    }

    public List<OrderDto> getOrders() {
        return feignClient.getOrders();
    }
}