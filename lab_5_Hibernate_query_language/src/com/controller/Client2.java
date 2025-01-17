package com.controller;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.model.Gift;

import java.util.List;

public class Client2 {

    public static void main(String[] args) {
        // Configure Hibernate and open a session
        Configuration c = new Configuration();
        SessionFactory sf = c.configure().buildSessionFactory();
        Session s = sf.openSession();

        try {
            // HQL query to select all Gift records
            String hql = "from Gift";
            Query q = s.createQuery(hql);

            // Execute the query and get the result list (list of Gift objects)
            List<Gift> lst = q.list();

            System.out.println("Gift names are:");

            // Iterate through the list of Gift objects and print the giftName
            for (Gift gift : lst) {
                System.out.println(gift.getGiftName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the session and session factory
            s.close();
            sf.close();
        }
    }
}
