/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.services;

import com.jfc.eclinic.dto.Address;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jfc
 */
public interface AddressService {

    /**
     *
     * @return @throws Exception
     */
    @NotNull
    List<Address> get() throws Exception;

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    Address get(@Min(0) int id) throws Exception;

    /**
     *
     * @param value
     * @throws Exception
     */
    void update(@NotNull @Valid Address value) throws Exception;

    /**
     *
     * @param value
     * @throws Exception
     */
    void create(@NotNull @Valid Address value) throws Exception;

    /**
     *
     * @param id
     * @throws Exception
     */
    void delete(Address id) throws Exception;

}
