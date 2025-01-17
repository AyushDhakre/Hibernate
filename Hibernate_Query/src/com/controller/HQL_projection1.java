package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import com.model.Employee;

public class HQL_projection1 {
public static void main(String[] args) {
	Configuration cf= new Configuration();
	SessionFactory sf=cf.configure().buildSessionFactory();
	Session s=sf.openSession();
	//select * from employee
	Criteria c =s.createCriteria(Employee.class);
	Projection p=Projections.property("ename");
	c.setProjection(p);
	List<String> lst=c.list();
	System.out.println("Employees names are:");
	for(String str:lst) {
		System.out.println(str);
	}


	s.close();
	sf.close();
	
	
}
}
