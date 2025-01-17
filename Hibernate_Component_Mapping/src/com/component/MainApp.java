package com.component;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Configuration c= new Configuration();
				SessionFactory sf=c.configure().buildSessionFactory();
				Session s=sf.openSession();
				Transaction t=s.beginTransaction();
				
				Employee e1=new Employee(101,34,new Address(1,"seed1","karve rd","pune"));
				Employee e2=new Employee(102,22,new Address(2,"seed2","karve rd","pune"));
				
				s.save(e1);
				s.save(e2);
				t.commit();
				s.close();
				sf.close();
	}

}
