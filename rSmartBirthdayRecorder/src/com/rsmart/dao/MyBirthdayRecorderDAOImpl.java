/**
 * 
 */
package com.rsmart.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.rsmart.model.MyBirthdayRecorder;

/**
 * @author Kranthi
 *
 */
public class MyBirthdayRecorderDAOImpl implements MyBirthdayRecorderDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public void saveOrUpdate(MyBirthdayRecorder myBirthdayRecorder) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.beginTransaction();
		session.saveOrUpdate(myBirthdayRecorder);
		
	}

	@Override
	public List<MyBirthdayRecorder> fetchAllBirthdayRecords() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.openSession();
		List<MyBirthdayRecorder> myBirthdayList = session.createQuery("from MyBirthdayRecorder").list();
		session.close();
		
		return myBirthdayList;
	}
/*
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
	@Override
	public void saveOrUpdate(MyBirthdayRecorder myBirthdayRecorder) {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(myBirthdayRecorder);
		tx.commit();
		session.close();
		
		
		
	}

	@Override
	public List<MyBirthdayRecorder> fetchAllBirthdayRecords() {
		// TODO Auto-generated method stub
		
		Session session = this.sessionFactory.openSession();
		List<MyBirthdayRecorder> myBirthdayList = session.createQuery("from MyBirthdayRecorder").list();
		session.close();
		return myBirthdayList;
	}

	
	

	*/

}
