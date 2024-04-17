package com.brunorozendo.test;


import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named(value="hello2")
@Stateless
public class Hello2 {
	

    private String message = "a EJB";


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
