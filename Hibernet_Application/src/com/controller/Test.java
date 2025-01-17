package com.controller;

import com.Model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Test 
{
  public static void main(String[] args) 
  {
	Configuration c= new Configuration();
	SessionFactory sf=c.configure().buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	
	//Transient 
	Employees e1= new Employees(101,"Amit",12550);
	
	//Persistence 
	s.save(e1);
	
	t.commit();
	s.close();
	sf.close();
  }// end main
}//end class
