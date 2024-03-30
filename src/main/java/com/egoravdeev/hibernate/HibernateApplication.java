package com.egoravdeev.hibernate;

import com.egoravdeev.hibernate.embedded.PersonId;
import com.egoravdeev.hibernate.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HibernateApplication implements CommandLineRunner {

	@PersistenceContext
	EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) {
		List<Person> persons = List.of(
				new Person(new PersonId("David", "Gagov", 18), "89998887766", "Москва"),
				new Person(new PersonId("Dava", "Hirek", 19), "88887776655", "Москва"),
				new Person(new PersonId("Fiola", "Biba", 20), "87776665544", "Питер"),
				new Person(new PersonId("Lupa", "Pupa", 21), "86665554433", "Казань")
		);
		persons.forEach(x -> entityManager.persist(x));

	}


}
