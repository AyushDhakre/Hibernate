package com.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="anno123")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "empType",discriminatorType = DiscriminatorType.STRING,length=20)
public class Employee {
	 @Id
	 @Column(name = "empid", length = 5)
	  int empid;
	 
	 @Column(name = "ename", length = 5)
	  String empName;
	 
	 public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + "]";
	}

	
}
