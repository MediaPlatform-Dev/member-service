package com.k1m743hyun.memberservice.service;

import com.k1m743hyun.memberservice.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {

    @InjectMocks
    MemberService memberService;

    @Mock
    MemberRepository memberRepository;


    @Test
    void join() {

        // given

        // when

        // then

    }

    @Test
    void findAMember() {

        // given

        // when

        // then

    }

    @Test
    void findMembers() {

        // given

        // when

        // then

    }
}