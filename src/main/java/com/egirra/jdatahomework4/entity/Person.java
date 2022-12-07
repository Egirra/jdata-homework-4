package com.egirra.jdatahomework4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSONS")
public class Person {
    @EmbeddedId
    private Human human;
    private String phoneNumber;
    private String cityOfLiving;
}
