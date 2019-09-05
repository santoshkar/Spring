package com.learning;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class EmployeeDao {
	private HibernateTemplate hibernateTemplate;
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
//	public void save(Employee emp) {
//		SessionFactory sessionfactory = hibernateTemplate.getSessionFactory();
//		
//		Session session = sessionfactory.openSession();
//		Transaction tx = session.beginTransaction();
//		try {
//			tx.begin();
//			
//			session.save(emp);
//			
//			tx.commit();
//		} catch (Exception e) {
//			tx.rollback();
//			// TODO: handle exception
//		} finally {
//			session.close();
//		}
//		
//	}
	
	public void save2(Employee emp) {
		hibernateTemplate.save(emp);
	}
	
	public Employee findById(long id) {
		return (Employee) getHibernateTemplate().get(Employee.class, id);
	}
	
}
