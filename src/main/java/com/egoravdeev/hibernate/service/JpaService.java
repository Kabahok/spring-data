package com.egoravdeev.hibernate.service;

import com.egoravdeev.hibernate.embedded.PersonId;
import com.egoravdeev.hibernate.model.Person;
import com.egoravdeev.hibernate.repository.JPARepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaService {
    private final JPARepository jpaRepository;

    public JpaService(JPARepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }


    public void deletePersonById(PersonId personId) {
        jpaRepository.deleteById(personId);
    }

    public void updatePerson(Person person) {
        jpaRepository.save(person);
    }

    public Person getPersonById(PersonId personId) {
        return jpaRepository.findById(personId).orElse(null);
    }

    public void createPerson(Person person) {
        jpaRepository.save(person);
    }

    public List<Person> getPersonsByCity(String city) {
        return jpaRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonsByAge(int age) {
        return jpaRepository.findByAgeLessThan(age, Sort.by(Sort.Direction.ASC, "age"));
    }

    public Person getPersonsByNameAndSurname(String name, String surname) {
        return jpaRepository.findByNameAndSurname(name, surname).orElse(null);
    }
}
