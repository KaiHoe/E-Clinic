/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.services.impl;

import com.jfc.eclinic.dao.AddressRepository;
import com.jfc.eclinic.dto.Address;
import com.jfc.eclinic.services.AddressService;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author F
 */
@Stateless
public class AddressServiceimpl implements AddressService {

    private AddressRepository addressRepository;

    @Inject
    public AddressServiceimpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public AddressServiceimpl() {
    }

    @Override
    public List<Address> get() throws Exception {
        return addressRepository.findAll();
    }

    @Override
    public Address get(int id) throws Exception {
        return addressRepository.findById(id);
    }

    @Override
    public void update(Address value) throws Exception {
        addressRepository.update(value);
    }

    @Override
    public void create(Address value) throws Exception {
        addressRepository.add(value);
    }

    @Override
    public void delete(Address id) throws Exception {
        addressRepository.remove(id);
    }
}
