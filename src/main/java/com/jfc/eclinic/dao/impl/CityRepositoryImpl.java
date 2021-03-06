/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.dao.impl;

import com.jfc.eclinic.dao.CityRepository;
import com.jfc.eclinic.dao.exception.RepositoryException;
import com.jfc.eclinic.dto.City;
import com.jfc.eclinic.dto.Country;
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
public class CityRepositoryImpl implements CityRepository {

    @PersistenceContext(unitName = "eclinicPU")
    EntityManager entityManager;

    @Override
    public void add(City t) throws RepositoryException {
        entityManager.persist(t);

    }

    @Override
    public List<City> findAll() {
        return entityManager.createNamedQuery("City.findAll").getResultList();
    }

    @Override
    public void update(City t) throws RepositoryException {
        entityManager.merge(t);

    }

    @Override
    public void remove(City t) throws RepositoryException {
        City current = null;
        if (!entityManager.contains(t)) {
            current = entityManager.merge(t);
        }
        entityManager.remove(current);

    }

    @Override
    public City findById(int t) throws RepositoryException {
        Query createNamedQuery = entityManager.createNamedQuery("City.findByCityId");
        List resultList = null;

        createNamedQuery.setParameter("cityId", t);
        resultList = createNamedQuery.getResultList();

        return resultList != null ? (City) resultList.get(0) : null;
    }

}
