package com.pradeep.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pradeep.hibernate.model.Student;

public class TestHibernateInsert {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();
		Student student = new Student();
		student.setId(56);
		student.setName("Rahul");
		student.setBranch("Mech");
		student.setEmail("rahul@gmail.com");
		student.setPercentage(90);
		student.setPhone(9009166);

		session.persist(student);// persisting the object

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}

}
