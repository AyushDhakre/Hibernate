package com.mapping;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {

    @Column(name = "hno", length = 8)
    private int hno;
    
    @Column(name = "house", length = 5)
    private String house;
    
    @Column(name = "street", length = 20)
    private String street;
    
    @Column(name = "city", length = 10)
    private String city;

    public Address() {
        super();
    }

    public Address(int hno, String house, String street, String city) {
        super();
        this.hno = hno;
        this.house = house;
        this.street = street;
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [hno=" + hno + ", house=" + house + ", street=" + street + ", city=" + city + "]";
    }
}
