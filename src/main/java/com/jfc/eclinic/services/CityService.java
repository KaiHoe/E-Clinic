/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.services;

import com.jfc.eclinic.dto.City;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * @author jfc
 */
public interface CityService {
        /**
     *
     * @return @throws Exception
     */
    @NotNull
    List<City> get() throws Exception;

    /**
     *
     * @param id
     * @return
     * @throws Exception
     */
    City get(@Min(0) int id) throws Exception;

    /**
     *
     * @param value
     * @throws Exception
     */
    void update(@NotNull @Valid City value) throws Exception;

    /**
     *
     * @param value
     * @throws Exception
     */
    void create(@NotNull @Valid City value) throws Exception;

    /**
     *
     * @param id
     * @throws Exception
     */
    void delete(City id) throws Exception;

}
