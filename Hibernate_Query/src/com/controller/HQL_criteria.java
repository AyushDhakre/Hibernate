package com.controller;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;

public class HQL_criteria {
public static void main(String[] args) {
	Configuration c= new Configuration();
	SessionFactory sf=c.configure().buildSessionFactory();
	Session s=sf.openSession();
	//select * from employee
	Criteria cq =s.createCriteria(Employee.class);
	Criterion cr=Restrictions.eq("id", 102);
	cq.add(cr);
	
	
	Object o=cq.uniqueResult();
	Employee e=(Employee)o;
	System.out.println("EmployeeNo:"+e.getId());
	System.out.println("EmployeeNo:"+e.getEname());
	System.out.println("EmployeeNo:"+e.getEsal());


	s.close();
	sf.close();
	
	
}
}
