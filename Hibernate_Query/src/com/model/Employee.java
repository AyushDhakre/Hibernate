package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp11")
public class Employee {
	
	@Id
	@Column(name="eid",length=3)
	int id;
	@Column(name="ename",length=10)

	String ename;
	@Column(name="esal",length=7)

	int esal;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String ename, int esal) {
		super();
		this.id = id;
		this.ename = ename;
		this.esal = esal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}
