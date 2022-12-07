package com.egirra.jdatahomework5.controller;

import com.egirra.jdatahomework5.entity.Person;
import com.egirra.jdatahomework5.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    private final PersonRepository repository;

    public Controller(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonByAgeLessThanOrderBy(int age) {
        return repository.findByAgeLessThanOrderBy(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}
