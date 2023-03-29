package com.example.CRUDWithSpringBoot.service;

import com.example.CRUDWithSpringBoot.entity.Person;
import com.example.CRUDWithSpringBoot.repos.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepos;


    @Override
    public Integer savePerson(Person person) {
        return personRepos.save(person).getId();
    }

    @Override
    public List<Person> getAllPersons() {
        return (List<Person>) personRepos.findAll();
    }

    @Override
    public Person getPersonById(Integer id) {
        return personRepos.findById(id).get();
    }

    @Override
    public void deletePerson(Integer id) {

        personRepos.deleteById(id);
    }


}

