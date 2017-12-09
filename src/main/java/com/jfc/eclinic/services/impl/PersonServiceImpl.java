/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.services.impl;

import com.jfc.eclinic.dao.PersonRepository;
import com.jfc.eclinic.dto.Person;
import com.jfc.eclinic.services.PersonService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jfc
 */
@Stateless
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Inject
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonServiceImpl() {
    }

    @Override
    public List<Person> get() throws Exception {
        return personRepository.findAll();
    }

    @Override
    public Person get(int id) throws Exception {
        return personRepository.findById(id);
    }

    @Override
    public void update(Person value) throws Exception {
        personRepository.update(value);
    }

    @Override
    public void create(Person value) throws Exception {
        personRepository.add(value);
    }

    @Override
    public void delete(Person id) throws Exception {
        personRepository.remove(id);
    }

}
