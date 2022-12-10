package com.egirra.jdatahomework4.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Persons")
public class Person implements Serializable {
    @EmbeddedId
    private Human human;
    private String phoneNumber;
    private String cityOfLiving;
}
