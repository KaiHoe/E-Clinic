/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.dao;

import com.jfc.eclinic.dao.exception.RepositoryException;
import com.jfc.eclinic.dto.Person;
import java.util.List;

/**
 *
 * @author jfc
 */
public interface PersonRepository  {
    
    /**
     * @param t
     * @throws com.jfc.eclinic.dao.exception.RepositoryException
     */
    public void add(Person t) throws RepositoryException;
    /**
     * @return
     * @throws com.jfc.eclinic.dao.exception.RepositoryException */
    public List<Person> findAll() throws RepositoryException;
    /**
     * @param t*
     * @throws com.jfc.eclinic.dao.exception.RepositoryException*/
    public void update(Person t) throws RepositoryException;
    /**
     * @param t
     * @throws com.jfc.eclinic.dao.exception.RepositoryException*/
    public void remove(Person t) throws RepositoryException;
    /**
     * @param t
     * @return
     * @throws com.jfc.eclinic.dao.exception.RepositoryException*/
    public Person findById(int t) throws RepositoryException;

}
