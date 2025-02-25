package com.controller;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Batsman;
import com.model.Bowler;

public class Client1 {
public static void main(String[] args) {
	

	Configuration c= new Configuration();
	SessionFactory sf=c.configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Batsman b=new Batsman(101, "rohitshrama", 20, new Address("main road", "india", "latur", "413512"), 1000);
	Batsman bb=new Batsman(102, "rohi", 10, new Address("main road", "india", "latur", "413512"), 100);

	
	Bowler b1=new Bowler(104, "virajkholi", 30, new Address("main road", "pak", "gondia", "413512"), 2000);
	Bowler b2=new Bowler(103, "viraj", 20, new Address("main road", "pak", "gondia", "413512"), 200);

   s.save(b);
   s.save(bb);
    s.save(b1);
    s.save(b2);
    t.commit();
    s.close();
}
}