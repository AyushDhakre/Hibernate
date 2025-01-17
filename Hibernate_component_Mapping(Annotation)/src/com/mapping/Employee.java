package com.mapping;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp10")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eid", length = 10)
    private int eid;

    @Column(name = "eno", length = 10)
    private int eno;
    
    @Embedded
    private Address addr;

    public Employee() {
        super();
    }

    public Employee(int eno, Address addr) {
        super();
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
