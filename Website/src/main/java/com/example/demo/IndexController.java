package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller

public class IndexController {
	
	@RequestMapping("index")
//	@ResponseBody
//	public String index(HttpServletRequest request) {
////		System.out.println("Hello !");
//		
//		HttpSession session = request.getSession();
//		String s = request.getParameter("name");
//		
//		session.setAttribute("username", s);
//
//		return "index";
//	}

//	passing values using core java
	
//	public String index(@RequestParam("uname")String name,
//			@RequestParam("pass")String pass, HttpSession session) {
//				
//		session.setAttribute("username", name);
//		session.setAttribute("password", pass);
//
//		return "index";
//	}
	public ModelAndView index(Userdetails ud) {
				
		ModelAndView mav = new ModelAndView();
		mav.addObject("details",ud);
		mav.setViewName("index");
	
		
		return mav;
//		return "index";
	}
	

}
