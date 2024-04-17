package com.brunorozendo.controller;

import com.brunorozendo.test.Hello;
import com.brunorozendo.test.Hello2;
import jakarta.ejb.EJB;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class CostumerController {

    @Inject
    Hello hello;

    @EJB
    Hello2 hello2;


    @GET
    @Path("/costumers")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return hello.getMessage()+hello2.getMessage();
    }
}

