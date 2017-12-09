/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.dao;

import com.jfc.eclinic.dao.exception.RepositoryException;
import com.jfc.eclinic.dto.City;
import java.util.List;

/**
 *
 * @author jfc
 */
public interface CityRepository  {
    
    /**
     * @param t
     * @throws com.jfc.eclinic.dao.exception.RepositoryException
     */
    public void add(City t) throws RepositoryException;
    /**
     * @return
     * @throws com.jfc.eclinic.dao.exception.RepositoryException */
    public List<City> findAll() throws RepositoryException;
    /**
     * @param t*
     * @throws com.jfc.eclinic.dao.exception.RepositoryException*/
    public void update(City t) throws RepositoryException;
    /**
     * @param t
     * @throws com.jfc.eclinic.dao.exception.RepositoryException*/
    public void remove(City t) throws RepositoryException;
    /**
     * @param t
     * @return
     * @throws com.jfc.eclinic.dao.exception.RepositoryException*/
    public City findById(int t) throws RepositoryException;

}
