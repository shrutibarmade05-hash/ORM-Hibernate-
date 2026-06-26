package com.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.entity.Customer;

public class DeleteData {

	 public void delete(int id) {

	        Configuration cfg = new Configuration();
	        cfg.configure();
	        cfg.addAnnotatedClass(Customer.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();

	        Transaction tx = session.beginTransaction();

	        Customer c = session.get(Customer.class, id);

	        if (c != null) {
	            session.remove(c);
	            System.out.println("Customer Deleted Successfully");
	        } else {
	            System.out.println("Customer Not Found");
	        }

	        tx.commit();

	        session.close();
	        sf.close();
	    }
}
