package com.rsmart.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rsmart.service.MyBirthdayRecorderService;




@Controller
@RequestMapping(value="rSmartBirthdayRecorder")
public class MyBirthdayRecorderController {
	/*
	
	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	MyBirthdayRecorderService myBirthdayRecorderService;
	*/
	@RequestMapping(value="/test")
	public String test()
	{
		return "view";
	}
	
	/*@Transactional
	public ModelAndView transferfunds(Principal principal) {
		Session session = sessionFactory.getCurrentSession();
		final String currentUser = principal.getName();
		ModelAndView model = new ModelAndView();
		List<Integer> userlist = new ArrayList<Integer>();
		// List<RegUser> reguser = session.createQuery(
		// "select from sbs.RegUser where accountNumber is not null").list();

		List<AccountInfo> reguser = reguserserv.getRegUsers(currentUser);
		for (AccountInfo reg : reguser)
			userlist.add(reg.getAccountNumber());

		System.out.println(userlist);
		model.addObject("regusers", userlist);
		model.setViewName("transferfunds");
		return model;

	}*/
}
