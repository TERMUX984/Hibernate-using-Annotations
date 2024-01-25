package Annotatiions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory();

		Employee e1 = new Employee(23, "Vinay", "20k");
		
		Student s1 = new Student(173,"Vinay",22);
		
		System.out.println(e1);
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.persist(s1);
		tx.commit();
		factory.close();
	}

}