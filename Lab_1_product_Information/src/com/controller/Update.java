package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hello.Product;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Configuration c = new Configuration();
	        SessionFactory sf = c.configure().buildSessionFactory();
	        Session s = sf.openSession();
	        Transaction t = s.beginTransaction();
	        
	        // Read product by code
            String code = "P003";
            Product fetchedProduct = (Product) s.get(Product.class, code);
            if (fetchedProduct != null) {
                System.out.println("Fetched Product: " + fetchedProduct.getName());
            } else {
                System.out.println("Product not found.");
            }
            // Update product details
            if (fetchedProduct != null) {
                fetchedProduct.setPrice(250.0);
                s.update(fetchedProduct);
                System.out.println("Product updated: " + fetchedProduct.getCode());
            }
            
	        
	    

	}

}
