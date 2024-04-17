package com.brunorozendo.jpa;

import com.brunorozendo.jpa.entities.CustomerEntity;
import com.brunorozendo.jpa.repository.CustomerRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);

        CustomerRepository repository = new CustomerRepository();
        CustomerEntity entity = new CustomerEntity();
        entity.setName(userName);

        repository.createCustomer(entity);
        entity = repository.readCustomer(1L);

        System.out.println("ID: " + entity.getId());
        System.out.println("Username is: " + entity.getName());

        entity.setName("new name");
        repository.updateCustomer(entity);
        CustomerEntity saved = repository.readCustomer(1L);

        System.out.println("ID: " + saved.getId());
        System.out.println("Username is: " + saved.getName());


        System.out.println("ID: " + saved.getId());
        System.out.println("delete Username ");




    }
}
