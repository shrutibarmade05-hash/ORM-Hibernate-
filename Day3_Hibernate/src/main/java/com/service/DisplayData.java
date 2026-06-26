package com.service;

import java.util.ArrayList;

import com.entity.Customer;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DisplayData {

	
	  public void display() {

	        Configuration cfg = new Configuration();
	        cfg.configure();
	        cfg.addAnnotatedClass(Customer.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();

	        List<Customer> list = session
	                .createQuery("from Customer", Customer.class)
	                .list();

	        for (Customer c : list) {
	            System.out.println(c);
	        }

	        session.close();
	        sf.close();
	    }
	
}


