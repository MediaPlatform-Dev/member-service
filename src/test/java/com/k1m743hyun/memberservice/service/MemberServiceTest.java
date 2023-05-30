package com.k1m743hyun.memberservice.service;

import com.k1m743hyun.memberservice.domain.mapper.MemberMapper;
import com.k1m743hyun.memberservice.repository.MemberRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MemberServiceTest {

    @InjectMocks
    MemberService service;

    @Mock
    MemberRepository repository;

    @Mock
    MemberMapper mapper;

    @Test
    @DisplayName("createMember 테스트")
    void createMember() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("getMember 테스트")
    void getMember() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("getMembers 테스트")
    void getMembers() {

        // given

        // when

        // then
    }

    @Test
    @DisplayName("deleteMember 테스트")
    void deleteMember() {

        // given

        // when

        // then
    }
}