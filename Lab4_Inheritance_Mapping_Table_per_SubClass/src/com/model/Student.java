package com.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "stud")
@Inheritance(strategy = InheritanceType.JOINED)
public class Student {
    @Id
    @Column(name = "RollNo", length = 10)
    private int rollno;

    @Column(name = "StudentName", length = 10)
    private String studentName;
    @Temporal(TemporalType.DATE)
    @Column(name = "admission_date")  // Renamed from "Date"
    private Date admissionDate;

    @Embedded
    private Address perAddr;

    public Student() {}

    public Student(int rollno, String studentName, Date admissionDate, Address perAddr) {
        this.rollno = rollno;
        this.studentName = studentName;
        this.admissionDate = admissionDate;
        this.perAddr = perAddr;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Address getPerAddr() {
        return perAddr;
    }

    public void setPerAddr(Address perAddr) {
        this.perAddr = perAddr;
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", studentName=" + studentName +
                ", admissionDate=" + admissionDate + ", perAddr=" + perAddr + "]";
    }
}