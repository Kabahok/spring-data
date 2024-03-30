package com.egoravdeev.hibernate.repository;

import com.egoravdeev.hibernate.embedded.PersonId;
import com.egoravdeev.hibernate.model.Person;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JPARepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeLessThan(int a, Sort sort);

    Optional<Person> findByNameAndSurname(String name, String surname);
}
