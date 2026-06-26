package com.service;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Customer;

public class UpdateData {
	 public void update(int id, String newName) {

	        Configuration cfg = new Configuration();
	        cfg.configure();
	        cfg.addAnnotatedClass(Customer.class);

	        SessionFactory sf = cfg.buildSessionFactory();
	        Session session = sf.openSession();

	        Transaction tx = session.beginTransaction();

	        Customer c = session.get(Customer.class, id);

	        if (c != null) {

	            c.setName(newName);

	            session.merge(c);

	            System.out.println("Customer Updated Successfully");
	        } else {

	            System.out.println("Customer Not Found");
	        }

	        tx.commit();

	        session.close();
	        sf.close();
	    }
}
