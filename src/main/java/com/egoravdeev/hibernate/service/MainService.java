package com.egoravdeev.hibernate.service;

import com.egoravdeev.hibernate.model.Person;
import com.egoravdeev.hibernate.repository.MainRepository;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.List;

public class MainService {

    private final MainRepository mainRepository;

    public MainService(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    public List<Person> getPersonsByCity(String city) {
        return mainRepository.getPersonsByCity(city);
    }
}
