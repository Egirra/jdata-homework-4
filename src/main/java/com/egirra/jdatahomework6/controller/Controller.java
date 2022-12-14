package com.egirra.jdatahomework6.controller;

import com.egirra.jdatahomework6.entity.Person;
import com.egirra.jdatahomework6.repository.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Person> getPersonByCity(@RequestParam("city") String city) {
        return repository.getPersonsByCity(city);
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}