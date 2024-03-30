package com.egoravdeev.hibernate.controllers;

import com.egoravdeev.hibernate.embedded.PersonId;
import com.egoravdeev.hibernate.model.Person;
import com.egoravdeev.hibernate.service.JpaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JpaController {
    private final JpaService jpaService;

    public JpaController(JpaService jpaService) {
        this.jpaService = jpaService;
    }

    @PostMapping("/persons")
    public void createPerson(@RequestBody Person person) {
        jpaService.createPerson(person);
    }

    @PutMapping("/persons")
    public void updatePerson(@RequestBody Person person) {
        jpaService.updatePerson(person);
    }

    @GetMapping("/persons")
    public Person getPersonById(@RequestBody PersonId personId) {
        return jpaService.getPersonById(personId);
    }

    @DeleteMapping("/persons")
    public void deletePersonById(@RequestBody PersonId personId) {
        jpaService.deletePersonById(personId);
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return jpaService.getPersonsByCity(city);
    }

    @GetMapping("/persons/by-age")
    public List<Person> getPersonsByAge(@RequestParam int age) {
        return jpaService.getPersonsByAge(age);
    }

    @GetMapping("/persons/by-name-surname")
    public Person getPersonByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return jpaService.getPersonsByNameAndSurname(name, surname);
    }
}
