package com.hibernate_Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Company {

	public static void main(String[] args) {
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Mobiles.class).addAnnotatedClass(Laptops.class);
		SessionFactory sf=con.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tr=ses.beginTransaction();
		
		//creating mobiles data
		Mobiles m1=new Mobiles();
		m1.setProductId(101);
		m1.setProductName("iphone");
		m1.setProductPrice("1,70,000");
		m1.setMobileModel("14 Pro");
		m1.setOperatingSystem("IOS 16.3");
		
		Mobiles m2=new Mobiles();
		m2.setProductId(102);
		m2.setProductName("One plus");
		m2.setProductPrice("40000");
		m2.setMobileModel("10R");
		m2.setOperatingSystem("Android 12.0");
		
		//creating laptop data
		Laptops l1=new Laptops();
		l1.setProductId(103);
		l1.setProductName("Dell");
		l1.setProductPrice("51,990");
		l1.setLaptopBrand("Inspiron");
		l1.setProcessor("Intel core i3");
		
		Laptops l2=new Laptops();
		l2.setProductId(104);
		l2.setProductName("HP");
		l2.setProductPrice("66,999");
		l2.setLaptopBrand("HP Inc");
		l2.setProcessor("intel core i5");
		 
		//inserting data to dp
		ses.save(l1);
		ses.save(l2);
		 ses.save(m1);
		 ses.save(m2);
		
		tr.commit();

	}

}
