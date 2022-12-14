package com.egirra.jdatahomework6.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class Human implements Serializable {
    private static final Long serialVersionUID = 1L;

    private String name;
    private String surname;
    private int age;
}