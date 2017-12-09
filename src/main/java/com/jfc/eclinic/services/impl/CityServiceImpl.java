/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.services.impl;

import com.jfc.eclinic.dao.CityRepository;
import com.jfc.eclinic.dto.City;
import com.jfc.eclinic.dto.Country;
import com.jfc.eclinic.services.CityService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author jfc
 */
@Stateless
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Inject
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public CityServiceImpl() {
    }

    @Override
    public List<City> get() throws Exception {
        return cityRepository.findAll();
    }

    @Override
    public City get(int id) throws Exception {
        return cityRepository.findById(id);
    }

    @Override
    public void update(City value) throws Exception {
        cityRepository.update(value);
    }

    @Override
    public void create(City value) throws Exception {
        cityRepository.add(value);
    }

    @Override
    public void delete(City id) throws Exception {
        cityRepository.remove(id);
    }

}
