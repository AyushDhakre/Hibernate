package com.component;

public class Address {
	
	private int hno;
	private String house;
	private String stress;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String house, String stress, String city) {
		super();
		this.hno = hno;
		this.house = house;
		this.stress = stress;
		this.city = city;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStress() {
		return stress;
	}
	public void setStress(String stress) {
		this.stress = stress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", house=" + house + ", stress=" + stress + ", city=" + city + "]";
	}
	
	
}
