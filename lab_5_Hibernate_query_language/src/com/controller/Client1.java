package com.controller;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.model.Gift;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        
		Gift e1=new Gift(1,"Amit","A",23);
		Gift e2=new Gift(2,"sumit","B",55);
		Gift e3=new Gift(3,"ajit","C",77);
		Gift e4=new Gift(4,"Ami","D",33);
		Gift e5=new Gift(5,"suit","E",45);
		Gift e6=new Gift(6,"jit","F",17);
		Gift e7=new Gift(7,"mit","I",73);
		Gift e8=new Gift(8,"sit","J",65);
		Gift e9=new Gift(9,"it","K",57);
		Gift e10=new Gift(10,"isst","I",67);



		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		s.save(e5);
		s.save(e6);
		s.save(e7);
		s.save(e8);
		s.save(e8);
		s.save(e9);
		s.save(e10);
		
		
		
		t.commit();
		s.close();
		sf.close();
		
        System.out.println("10 gift records saved successfully.");
	}

}
