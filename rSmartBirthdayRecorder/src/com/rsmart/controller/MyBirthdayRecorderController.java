package com.rsmart.controller;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rsmart.model.MyBirthdayRecorder;
import com.rsmart.service.MyBirthdayRecorderService;





@Controller
public class MyBirthdayRecorderController {
	
	
	SessionFactory sessionFactory;

	
	MyBirthdayRecorderService myBirthdayRecorderService;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView defaultPage() {
		return new ModelAndView("view");
	}
	
	@RequestMapping(value="/test", method= RequestMethod.GET)
	public ModelAndView test()
	{
		ModelAndView model = new ModelAndView();
		
		return new ModelAndView("test");
	}
	
	
	@RequestMapping(value="/getAllUsers", method= RequestMethod.GET)
	public ModelAndView getAllUsers() {
		
		
		
		
		ModelAndView model = new ModelAndView();
		List<Integer> userlist = new ArrayList<Integer>();
		

		System.out.println("size: ");
		List<MyBirthdayRecorder> reguser = myBirthdayRecorderService.fetchBirthdayUsers();
		System.out.println("size: "+reguser.size());

		
		
		return new ModelAndView("regusers");

	}
}
