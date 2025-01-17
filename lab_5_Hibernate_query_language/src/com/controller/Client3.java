package com.controller;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.model.Gift;

import java.util.List;
import java.util.Scanner;

public class Client3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the category of gifts: ");
        String category = scanner.nextLine();
        
        Configuration c = new Configuration();
        SessionFactory sf = c.configure().buildSessionFactory();
        Session s = sf.openSession();

        try {
            String hql = "from Gift where category = ?";
            Query q = s.createQuery(hql);
            
            q.setParameter(0, category);

            List<Gift> lst = q.list();

            if (lst.isEmpty()) {
                System.out.println("No gifts found in category: " + category);
            } else {
                System.out.println("Gifts in category " + category + ":");
                for (Gift gift : lst) {
                    System.out.println(gift.getGiftName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the session and session factory
            s.close();
            sf.close();
            scanner.close();
        }
    }
}
