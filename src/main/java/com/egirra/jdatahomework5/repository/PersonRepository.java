package com.egirra.jdatahomework5.repository;

import com.egirra.jdatahomework5.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThanOrderBy(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
