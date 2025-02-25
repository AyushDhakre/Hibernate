package com.model;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "SecondaryStudent")
@PrimaryKeyJoinColumn(name = "T_ID")
public class SecondaryStudent extends Student {
    @Column(name = "percentage", length = 10)
    private float percentage;

    public SecondaryStudent() {
        super();
    }

    public SecondaryStudent(int rollno, String studentName, Date admissionDate, Address perAddr, float percentage) {
        super(rollno, studentName, admissionDate, perAddr);
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "SecondaryStudent [percentage=" + percentage + "]";
    }
}
