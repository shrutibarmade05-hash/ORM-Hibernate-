package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

public class InsertData {

    public void insert(Customer c) {

        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Customer.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.persist(c);

        tx.commit();

        System.out.println("Data Inserted Successfully");

        session.close();
        sf.close();
    }
}