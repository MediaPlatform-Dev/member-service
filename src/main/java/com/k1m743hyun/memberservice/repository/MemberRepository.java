package com.k1m743hyun.memberservice.repository;

import com.k1m743hyun.memberservice.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {

}