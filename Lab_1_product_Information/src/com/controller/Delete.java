package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Hello.Product;

public class Delete {

    public static void main(String[] args) {
        // Configure Hibernate and open session
        Configuration c = new Configuration();
        SessionFactory sf = c.configure().buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();
        
        // Define the product code to delete
        String Code = "P002"; // The product code to be deleted
        
        // Fetch the product to delete by its code
        Product productToDelete = (Product) s.get(Product.class, Code);
        
        if (productToDelete != null) {
            // Delete the product from the database
            s.delete(productToDelete);
            System.out.println("Product with code " + Code + " has been deleted.");
        } else {
            System.out.println("Product with code " +Code + " not found.");
        }
        
        // Commit the transaction
        t.commit();
        
        // Close the session and session factory
        s.close();
        sf.close();
    }
}
