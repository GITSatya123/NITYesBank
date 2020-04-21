package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.st.dao.StudentDAO;

@Controller
public class StudentController {

	@RequestMapping("/home.htm")
	public ModelAndView showDetails() {
		ModelAndView mav= new ModelAndView();
		mav.setViewName("home");
		
		StudentDAO s= new StudentDAO();
		s.setSno(101);
		s.setSname("Anuu");
		s.setAddress("odisha");
		s.setMarks(90);
		return mav.addObject("student", s);
		
	}
}
