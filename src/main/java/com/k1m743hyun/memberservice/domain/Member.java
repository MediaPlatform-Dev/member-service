package com.k1m743hyun.memberservice.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private Long id;

    @Column
    private String name;
}