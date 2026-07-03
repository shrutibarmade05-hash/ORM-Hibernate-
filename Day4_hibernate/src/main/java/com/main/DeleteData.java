package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Employee;

public class DeleteData {
	
	public static void main(String args[]) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
        Session ss = sf.openSession();
        Transaction tr = ss.beginTransaction();
        
   /*   for sql =   int id = 233;
        Employee e = ss.get(Employee.class, id);
        ss.remove(e);
        */
        
        
        
        //delete from employee where id = 453;
        //for hql
        String hqlQuery = "delete from Employee where id = :id ";
        MutationQuery  query = ss.createMutationQuery(hqlQuery);
        query.setParameter("id", 453);
        query.executeUpdate();
 
        
        System.out.println("Deleted.....!");
        tr.commit();
        ss.close();
        

	}

}
