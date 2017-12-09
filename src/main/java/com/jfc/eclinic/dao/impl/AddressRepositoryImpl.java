/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.dao.impl;

import com.jfc.eclinic.dao.exception.RepositoryException;
import com.jfc.eclinic.dao.AddressRepository;
import com.jfc.eclinic.dto.Address;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author jfc
 */
@Named
public class AddressRepositoryImpl implements AddressRepository {

    @PersistenceContext(unitName = "eclinicPU")
    EntityManager entityManager;

    @Override
    public void add(Address t) throws RepositoryException {
        entityManager.persist(t);
    }

    @Override
    public List<Address> findAll() {
        return entityManager.createNamedQuery("Address.findAll").getResultList();
    }

    @Override
    public void update(Address t) throws RepositoryException {
        entityManager.merge(t);
    }

    @Override
    public void remove(Address t) throws RepositoryException {
        entityManager.remove(t);
    }

    @Override
    public Address findById(int t) throws RepositoryException {

        Query createNamedQuery = entityManager.createNamedQuery("Address.findByAddressId");
        List resultList = null;

        createNamedQuery.setParameter("addressId", t);
        resultList = createNamedQuery.getResultList();

        return resultList != null ? (Address) resultList.get(0) : null;
    }

}
