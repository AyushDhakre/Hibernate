package com.controller;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hello.Product;

public class Create  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration c= new Configuration();
		SessionFactory sf=c.configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		
		
		Product product2 = new Product(); 
		product2.setCode("P002");
		product2.setName("Product Two");
		product2.setPrice(200.0);
		product2.setBrand("BrandB");
		product2.setManufacturingDate(new Date());
		
		Product product3 = new Product();
		product3.setCode("P003"); 
		product3.setName("Product Three"); 
		product3.setPrice(300.0); 
		product3.setBrand("BrandC"); 
		product3.setManufacturingDate(new Date());
		
		Product product4 = new Product(); 
		product4.setCode("P004"); 
		product4.setName("Product Four");
		product4.setPrice(400.0); 
		product4.setBrand("BrandD"); 
		product4.setManufacturingDate(new Date());
		
		//Persistence 
		
		s.save(product2);
		s.save(product3);
		s.save(product4);
		
		
		t.commit();
		s.close();
		sf.close();
	  }// end main
	}//end class
