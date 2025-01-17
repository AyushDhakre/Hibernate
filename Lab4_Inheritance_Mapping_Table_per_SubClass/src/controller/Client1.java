package controller;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.model.*;
import java.util.Date;

public class Client1 {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        SessionFactory sf = cfg.configure().buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Proper Date Initialization
        Date currentDate = new Date();

        PrimaryStudent ps = new PrimaryStudent(101, "Amit", currentDate,
                new Address("main road", "india", "latur", "413512"), "A");

        PrimaryStudent s = new PrimaryStudent(102, "Ayush", currentDate,
                new Address("main road", "india", "latur", "413512"), "B");

        SecondaryStudent a = new SecondaryStudent(103, "Sham", currentDate,
                new Address("main road", "india", "latur", "413512"), 85.5f);

        SecondaryStudent b = new SecondaryStudent(104, "Sumit", currentDate,
                new Address("main road", "india", "latur", "413512"), 83.5f);

        session.save(ps);
        session.save(s);
        session.save(a);
        session.save(b);
        tx.commit();
        session.close();
    }
}
