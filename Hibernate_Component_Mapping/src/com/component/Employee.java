package com.component;

public class Employee  {
	private int eid;
	private int eno;
	private Address addr;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, int eno, Address addr) {
		super();
		this.eid = eid;
		this.eno = eno;
		this.addr = addr;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eno=" + eno + ", addr=" + addr + "]";
	}
	
	
	
	
	
	
}
