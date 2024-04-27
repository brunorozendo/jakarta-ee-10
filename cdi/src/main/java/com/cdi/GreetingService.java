package com.cdi;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class GreetingService {

	private String name;
    private String message;

    public void createMessage() {
        message = "Hello, " + getName() + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

}
