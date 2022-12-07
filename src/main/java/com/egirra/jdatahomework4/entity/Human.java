package com.egirra.jdatahomework4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class Human implements Serializable {
    private String name;
    private String surname;
    private int age;
}
