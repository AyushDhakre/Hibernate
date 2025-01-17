package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		
		
		Employee e1=new Employee(101,"Amit",1225);
		Employee e2=new Employee(102,"sumit",1425);
		Employee e3=new Employee(103,"ajit",1565);

		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		t.commit();
		s.close();
		sf.close();
		

	}

}
