package com.egirra.jdatahomework6.repository;

import com.egirra.jdatahomework6.entity.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where p.cityOfLiving = :city");
        query.setParameter("city", city);
        return query.getResultList();
    }
}