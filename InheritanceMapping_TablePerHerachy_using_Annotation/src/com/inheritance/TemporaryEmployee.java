package com.inheritance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Entity
@DiscriminatorValue(value = "inheritance")
public class TemporaryEmployee extends Employee {
	 @Column(name = "WorkDays", length = 5)
	 int workdays;
	 @Column(name = "cname", length = 5)
	 String cname;
	public TemporaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TemporaryEmployee(int empid, String empName,int workdays, String cname) {
		super(empid,empName);
		this.workdays = workdays;
		this.cname = cname;
	}
	public int getWorkdays() {
		return workdays;
	}
	public void setWorkdays(int workdays) {
		this.workdays = workdays;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "TemporaryEmployee [workdays=" + workdays + ", cname=" + cname + "]";
	}
	
	 
	 
 

	
}