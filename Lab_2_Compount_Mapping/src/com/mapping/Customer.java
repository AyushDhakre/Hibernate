package com.mapping;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custId;
    private String custName;
    private String contactNo;
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Embedded
    private Address resAddr;

    // Getters and Setters
    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Address getResAddr() {
        return resAddr;
    }

    public void setResAddr(Address resAddr) {
        this.resAddr = resAddr;
    }
}
