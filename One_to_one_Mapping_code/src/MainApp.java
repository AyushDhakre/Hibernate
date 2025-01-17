import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class MainApp {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create Employee_details
        Employee_details details = new Employee_details(1L, "123 Street", "New York", "NY", "USA");

        // Create Employee
        Employee employee = new Employee(1L, "John", "Doe", new Date(), "1234567890", details);

        // Save Employee (this will also save Employee_details due to cascading)
        session.save(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();

        System.out.println("One-to-One mapping example completed successfully!");
    }
}
