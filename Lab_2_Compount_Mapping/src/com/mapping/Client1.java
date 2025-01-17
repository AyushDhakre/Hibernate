package com.mapping;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();

	}

}
