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
		
		Employee e1=new Employee(101,"Ayush",3425);
		PerEmp e2=new PerEmp(102,"sumit",3252,"manager","sales");
		TempEmp e3=new TempEmp(103,"ayush",6588,5,"tcs");
		
		
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		t.commit();
		s.close();
		sf.close();
		
	}

}
