package com.ecommerce.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecommerce.entity.Customers;

public class CustomerDAO {
	public static Customers fetchUsers(int cid)
	{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Customers cust = (Customers) session.createQuery("From Customers where cid="+cid).getSingleResult();		
		return cust;
	}
	
	public static void updateUser(Customers customer)
	{
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Customers cust = new Customers(customer.getId(), customer.getName(), customer.getEmail(), customer.getPassword());
		
		session.update(cust);
		
		tx.commit();
		
		session.close();
	}
}
