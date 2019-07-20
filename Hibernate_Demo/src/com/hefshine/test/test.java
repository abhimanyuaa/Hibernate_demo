package com.hefshine.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hefshine.beans.Person;

public class test {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		session.beginTransaction();

		session.save(new Person(21 ,"xyz", "Awalekar", "mumbai"));

		session.getTransaction().commit();

		session.close();
		
		System.out.println("Suucesfull");

	}
}
