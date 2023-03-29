package com.example.CRUDWithSpringBoot.service;

import com.example.CRUDWithSpringBoot.entity.Person;

import java.util.List;


public interface PersonService  {
    public Integer savePerson(Person Person);
    public List<Person> getAllPersons();
    public Person getPersonById(Integer id);
    public void deletePerson(Integer id);



}