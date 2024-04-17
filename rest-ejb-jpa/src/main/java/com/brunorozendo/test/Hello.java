package com.brunorozendo.test;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value="hello")
@RequestScoped
public class Hello {
	

    private String message = "a value";


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
