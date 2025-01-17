package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {
        Configuration c = new Configuration().configure();
        SessionFactory sf = c.buildSessionFactory();
        Session s = sf.openSession();
        Transaction t = s.beginTransaction();

        Employee e1 = new Employee(34, new Address(1, "A1", "Karve Road", "Pune"));
        Employee e2 = new Employee(22, new Address(2, "B2", "FC Road", "Mumbai"));

        s.persist(e1);
        s.persist(e2);
        
        t.commit();
        s.close();
        sf.close();

        System.out.println("Data Saved Successfully!");
    }
}
