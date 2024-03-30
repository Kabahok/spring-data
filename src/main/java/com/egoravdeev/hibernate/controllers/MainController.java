package com.egoravdeev.hibernate.controllers;

import com.egoravdeev.hibernate.model.Person;
import com.egoravdeev.hibernate.service.MainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class MainController {
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return mainService.getPersonsByCity(city);
    }

}
