package com.controller;

import org.hibernate.*;

import org.hibernate.cfg.Configuration;
import com.model.Employee;
import com.model.Department;

public class MainApp8 {

	public static void main(String[] args) {
		  	Configuration c = new Configuration();
	        SessionFactory sf = c.configure().buildSessionFactory();
	        Session s = sf.openSession();
	        Department dept1 = new Department();
			dept1.setDepartmentid(101);
	        dept1.setDepartmentName("Sales");

		Department dept2 = new Department();
		dept2.setDepartmentid(102);
		dept2.setDepartmentName("Marketing");
		
		
		Employee e1 = new Employee(131, "Salman", "Khan", "852", "8569824173");
		Employee e2 = new Employee(132,"Amir","Khan","654","8567412930");

		dept1.setEmployee(e1);
		dept2.setEmployee(e2);
		
		e1.setDepartment(dept1);
		e2.setDepartment(dept1);
		s.save(e1);
		s.save(e2);
		
		s.save(dept1);
		s.save(dept2);

	
		Employee e3 = new Employee(131,"Suhel","Khan","852","8569824173");
		Employee e4 = new Employee(132,"Sharukh","Khan","654","8567412930");

		
		e3.setDepartment(dept2);
		e4.setDepartment(dept2);
		
		s.save(e3);
		s.save(e4);
	}

}