package com.brunorozendo.jpa.repository;

import com.brunorozendo.jpa.entities.CustomerEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CustomerRepository {


    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
    private EntityManager em = emf.createEntityManager();

    public void createCustomer(CustomerEntity user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    public CustomerEntity readCustomer(Long id) {
        return em.find(CustomerEntity.class, id);
    }

    public void updateCustomer(CustomerEntity user) {
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
    }

    public void deleteCustomer(Long id) {
        em.getTransaction().begin();
        CustomerEntity user = em.find(CustomerEntity.class, id);
        if (user != null) {
            em.remove(user);
        }
    }

}