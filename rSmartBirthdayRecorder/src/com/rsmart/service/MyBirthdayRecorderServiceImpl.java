/**
 * 
 */
package com.rsmart.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rsmart.model.MyBirthdayRecorder;


/**
 * @author Kranthi
 *
 */

@Service
public class MyBirthdayRecorderServiceImpl implements MyBirthdayRecorderService {

	@Override
	public MyBirthdayRecorder addBirthdayUser(MyBirthdayRecorder user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyBirthdayRecorder updateBirthdayUser(MyBirthdayRecorder user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyBirthdayRecorder> fetchBirthdayUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	@Autowired
	SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public MyBirthdayRecorder addBirthdayUser(MyBirthdayRecorder user) {
		// TODO Auto-generated method stub
		
			Session session=sessionFactory.getCurrentSession();
			session.save(user);
			System.out.println("User "+ user.getMyBirthdayRecorderPrimaryKey().getFirstName()+ "has been added successfully ");
		
		return user;
	}

	
	@Override
	@Transactional
	public MyBirthdayRecorder updateBirthdayUser(MyBirthdayRecorder user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
		System.out.println("User "+ user.getMyBirthdayRecorderPrimaryKey().getFirstName()+ "has been updated successfully ");
	
	return user;
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MyBirthdayRecorder> fetchBirthdayUsers() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		List<MyBirthdayRecorder> myBirthdayList = session.createQuery("from MyBirthdayRecorder").list();
		session.close();
		return myBirthdayList;
		
		
	}
*/
	

}
