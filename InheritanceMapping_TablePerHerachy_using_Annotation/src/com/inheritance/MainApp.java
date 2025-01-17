package com.inheritance;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Employee e1=new Employee(101,"Ayush");
		PermanentEmployee e2=new PermanentEmployee(102,"sumit","manager","sales");
		TemporaryEmployee e3=new TemporaryEmployee(103,"ayush",5,"tcs");
		
		
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		t.commit();
		s.close();
		sf.close();
		
	}

}
