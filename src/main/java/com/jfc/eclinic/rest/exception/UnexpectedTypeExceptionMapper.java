/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jfc.eclinic.rest.exception;

import javax.validation.UnexpectedTypeException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author jfc
 */
@Provider
public class UnexpectedTypeExceptionMapper implements ExceptionMapper<UnexpectedTypeException> {

    @Override
    public Response toResponse(UnexpectedTypeException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).header("x-UnexpectedTypeException", exception.getMessage()).build();
    }

}
