/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.dao.impl;

import com.jfc.eclinic.dao.PersonRepository;
import com.jfc.eclinic.dao.exception.RepositoryException;
import com.jfc.eclinic.dto.Person;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jfc
 */
@Named
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext(unitName = "eclinicPU")
    EntityManager entityManager;

    @Override
    public void add(Person t) throws RepositoryException {
        entityManager.persist(t);

    }

    @Override
    public List<Person> findAll() {
        return entityManager.createNamedQuery("Person.findAll").getResultList();
    }

    @Override
    public void update(Person t) throws RepositoryException {
        entityManager.merge(t);

    }

    @Override
    public void remove(Person t) throws RepositoryException {
        Person current = null;
        if (!entityManager.contains(t)) {
            current = entityManager.merge(t);
        }
        entityManager.remove(current);

    }

    @Override
    public Person findById(int t) throws RepositoryException {
        Query createNamedQuery = entityManager.createNamedQuery("Person.findByPersonId");
        List resultList = null;

        createNamedQuery.setParameter("personId", t);
        resultList = createNamedQuery.getResultList();

        return resultList != null ? (Person) resultList.get(0) : null;
    }

}
