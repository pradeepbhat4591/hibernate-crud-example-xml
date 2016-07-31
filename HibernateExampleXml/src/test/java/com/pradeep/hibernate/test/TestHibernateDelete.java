package com.pradeep.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pradeep.hibernate.model.Student;

public class TestHibernateDelete {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// creating transaction object

		Object object = session.load(Student.class, new Integer(56));
		Student student = (Student) object;

		Transaction t = session.beginTransaction();

		session.delete(student);
		System.out.println("Object Deleted successfully.....!!");

		t.commit();
		session.close();

		System.out.println("successfully saved");

	}

}
