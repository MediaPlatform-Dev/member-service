package com.k1m743hyun.memberservice.controller;

import com.k1m743hyun.memberservice.domain.Member;
import com.k1m743hyun.memberservice.service.MemberService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{id}")
    public Member one(@PathVariable Long id) {
        return memberService.findOneMember(id);
    }

    @GetMapping("/list")
    public List<Member> list() {
        return memberService.findMembers();
    }
}