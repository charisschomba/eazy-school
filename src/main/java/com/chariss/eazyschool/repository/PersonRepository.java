package com.chariss.eazyschool.repository;

import com.chariss.eazyschool.model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Person readByEmail(String email);
}
