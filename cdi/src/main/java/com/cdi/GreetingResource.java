package com.cdi;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/greet")
public class GreetingResource {

    private final GreetingService greetingService;

    @Inject
    public GreetingResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    public String get() {
        greetingService.setName("bruno");
        greetingService.createMessage();
        return greetingService.getMessage();
    }
}
