package com.rsmart.service;

import java.util.List;

import com.rsmart.model.MyBirthdayRecorder;

public interface MyBirthdayRecorderService {
	
	MyBirthdayRecorder addBirthdayUser(MyBirthdayRecorder user);

	MyBirthdayRecorder updateBirthdayUser(MyBirthdayRecorder user);

	List<MyBirthdayRecorder> fetchBirthdayUsers();
}
