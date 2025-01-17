package com.model;
import javax.persistence.*;
@Entity
@Table(name="hib_Employee")
public class Employee 
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="eid")
private int employeeld;

@Column(name="fname", length=15)
private String firstname;

@Column(name="Iname", length=15)
private String lastname;

@Column(name="bdate")
private String birthDate;

@Column(name="cellphone", length=20)
private String cellphone;

@ManyToOne
@JoinColumn(name="dept_id")
 Department department;

public Employee() {
	super();
}

public Employee(int employeeld, String firstname, String lastname, String birthDate, String cellphone) {
	super();
	this.employeeld = employeeld;
	this.firstname = firstname;
	this.lastname = lastname;
	this.birthDate = birthDate;
	this.cellphone = cellphone;
}

public int getEmployeeld() {
	return employeeld;
}

public void setEmployeeld(int employeeld) {
	this.employeeld = employeeld;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getBirthDate() {
	return birthDate;
}

public void setBirthDate(String birthDate) {
	this.birthDate = birthDate;
}

public String getCellphone() {
	return cellphone;
}

public void setCellphone(String cellphone) {
	this.cellphone = cellphone;
}



public Department getDepartment() {
	return department;
}

public void setDepartment(Department department) {
	this.department = department;
}

@Override
public String toString() {
	return "Employee [employeeld=" + employeeld + ", firstname=" + firstname + ", lastname=" + lastname + ", birthDate="
			+ birthDate + ", cellphone=" + cellphone + ", department=" + department + "]";
}

}