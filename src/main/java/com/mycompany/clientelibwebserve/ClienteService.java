/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientelibwebserve;



/**
 *
 * @author usuario
 */


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface ClienteService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<ICliente> read();

    @GET
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    ICliente read(@PathParam("codigo") int codigo);

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    void create(ICliente cliente);

    @PUT
    @Path("/{codigo}")
    @Consumes(MediaType.APPLICATION_JSON)
    void update(@PathParam("codigo") int codigo, ICliente cliente);

    @DELETE
    @Path("/{codigo}")
    void delete(@PathParam("codigo") int codigo);
}