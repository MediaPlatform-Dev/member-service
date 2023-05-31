package com.k1m743hyun.memberservice.controller;

import com.k1m743hyun.memberservice.domain.dto.MemberDto;
import com.k1m743hyun.memberservice.domain.dto.OrderDto;
import com.k1m743hyun.memberservice.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService service;

    @PostMapping
    public void createMember(@RequestBody MemberDto requestDto) {
        service.createMember(requestDto);
    }

    @GetMapping("/{memberNum}")
    public MemberDto getMember(@PathVariable String memberNum) {
        return service.getMember(memberNum);
    }

    @GetMapping
    public List<MemberDto> getMembers() {
        return service.getMembers();
    }

    @DeleteMapping
    public void deleteMember(@RequestBody MemberDto requestDto) {
        service.deleteMember(requestDto);
    }

    @GetMapping("/orders")
    public List<OrderDto> getOrders() {
        return service.getOrders();
    }
}