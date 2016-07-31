package com.pradeep.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pradeep.hibernate.model.Student;

public class TestHibernateUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// creating transaction object

		Student student=new Student();
		student.setName("Pujara");
	    student.setId(17);
 

		Transaction t = session.beginTransaction();

		session.update(student);
		System.out.println("Object Updated successfully.....!!");

		t.commit();
		session.close();

		System.out.println("successfully saved");

	}

}
