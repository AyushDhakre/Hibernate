package com.controller;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.model.Employee;

public class HQL_criteria2question {
public static void main(String[] args) {
	Configuration cf= new Configuration();
	SessionFactory sf=cf.configure().buildSessionFactory();
	Session s=sf.openSession();
	//select * from employee
	Criteria c =s.createCriteria(Employee.class);
	ProjectionList plist=Projections.projectionList();
	plist.add(Projections.property("id"));
	plist.add(Projections.property("ename"));
	plist.add(Projections.property("esal"));
	c.setProjection(plist);
	List <Object> lst=c.list();
	for(Object o:lst) {
		Object ar[]=(Object[])o;
		System.out.println(ar[0]+"\n"+ar[1]+"\n"+ar[2]);
		
	}
	
s.close();
sf.close();

	
	
	
}
}
