package br.com.startup.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.startup.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}