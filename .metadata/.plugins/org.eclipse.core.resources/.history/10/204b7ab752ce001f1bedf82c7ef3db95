package com.model;
import java.util.Set;
import javax.persistence.*;
@Entity
@Table(name="hib_department")
public class Department 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="dept_id")
private int departmentid;

@Column(name="dept_name", length=10) private String departmentName;
@OneToMany(mappedBy="department", cascade=CascadeType.ALL)
Set<Employee> employees;
@OneToOne
@PrimaryKeyJoinColumn
public Employee employee;

public Department() 
{
		super();
}
public Department(int departmentid, String departmentName, Set<Employee> employees)
{
		super();
		this.departmentid = departmentid;
		this.departmentName = departmentName;
		this.employees = employees;
}
public int getDepartmentid() 
{
	return departmentid;
}
public void setDepartmentid(int departmentid) 
{
		this.departmentid = departmentid;
}
public String getDepartmentName() 
{
		return departmentName;
}
public void setDepartmentName(String departmentName) 
{
		this.departmentName = departmentName;
}
public Set<Employee> getEmployees() 
{
		return employees;
}
public void setEmployees(Set<Employee> employees) 
{
	this.employees = employees;
}
public Employee getEmployee() 
{
	return employee;
}
public void setEmployee(Employee employee) 
{
		this.employee = employee;
}
@Override
public String toString() 
 {
	return "Department [departmentid=" + departmentid + ", departmentName=" + departmentName + ", employees="
			+ employees + ", employee=" + employee + "]";
 }
}