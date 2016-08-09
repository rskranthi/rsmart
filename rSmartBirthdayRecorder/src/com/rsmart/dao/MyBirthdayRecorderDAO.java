/**
 * 
 */
package com.rsmart.dao;

import java.util.List;

import com.rsmart.model.MyBirthdayRecorder;

/**
 * @author Kranthi
 *
 */
public interface MyBirthdayRecorderDAO  {

	
	public void saveOrUpdate(MyBirthdayRecorder myBirthdayRecorder);
	
	public List<MyBirthdayRecorder> fetchAllBirthdayRecords();
	
	
}
