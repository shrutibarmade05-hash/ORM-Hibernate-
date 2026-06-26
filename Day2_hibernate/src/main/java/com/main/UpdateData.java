package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;


public class UpdateData {
public static void main(String args[]) {
	
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		int id = 123;

		Employee e = ss.get(Employee.class, id);
		e.setCity("Goa");
		e.setEmailId("om@gmail.com");
		e.setMobileNo(234567876543l);
		e.setEmpname("om");

//		ss.update(e);
		ss.merge(e);
		System.out.println("updated ...!");
		tr.commit();
		ss.close();

}
}
