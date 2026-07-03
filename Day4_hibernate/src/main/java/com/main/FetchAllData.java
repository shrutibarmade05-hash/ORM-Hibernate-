package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.mysql.cj.Query;

public class FetchAllData {
	public static void main(String args[]) {

	Configuration cfg = new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(Employee.class);

	SessionFactory sf = cfg.buildSessionFactory();
    Session ss = sf.openSession();
    Transaction tr = ss.beginTransaction();
    
    //sql = select * from employee
    
    String hqlQuery = "from Employee";
    org.hibernate.query.Query<Employee> query =  ss.createQuery(hqlQuery , Employee.class);
    List<Employee> list = query.list();
    
    for(Employee emp : list) {
    	System.out.println(emp);
    }
    
    tr.commit();
    ss.close();
    
    
    
    
    
}
}