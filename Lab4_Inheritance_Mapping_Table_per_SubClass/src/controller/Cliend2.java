package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.PrimaryStudent;
import com.model.SecondaryStudent;
import com.model.Student;

import java.util.Scanner;

public class Cliend2 {
    public static void main(String[] args) {
        // Setup Hibernate session
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        // Get roll number from user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollno = scanner.nextInt();

        // Retrieve and print student details by roll number
        Student student = (Student) session.get(Student.class, rollno);
        if (student != null) {
            System.out.println("Roll No: " + student.getRollno());
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Admission Date: " + student.getAdmissionDate());
            System.out.println("Address: " + student.getPerAddr().getStreet() + ", " +
                               student.getPerAddr().getCity() + ", " +
                               student.getPerAddr().getCountry() + ", " +
                               student.getPerAddr().getPincode());

            if (student instanceof PrimaryStudent) {
                System.out.println("Grade: " + ((PrimaryStudent) student).getGrade());
            } else if (student instanceof SecondaryStudent) {
                System.out.println("Percentage: " + ((SecondaryStudent) student).getPercentage());
            }
        } else {
            System.out.println("Student with roll number " + rollno + " not found.");
        }

        session.close();
        factory.close();
        scanner.close();
    }
}
