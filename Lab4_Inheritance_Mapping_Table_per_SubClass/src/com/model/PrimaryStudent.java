package com.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "PrimaryStudent")
@PrimaryKeyJoinColumn(name = "P_ID")
public class PrimaryStudent extends Student {
    @Column(name = "Grade", length = 10)
    private String grade;

    public PrimaryStudent() {
        super();
    }

    public PrimaryStudent(int rollno, String studentName, Date admissionDate, Address perAddr, String grade) {
        super(rollno, studentName, admissionDate, perAddr);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "PrimaryStudent [grade=" + grade + "]";
    }
}
