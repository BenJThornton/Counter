package com.codingdojo.counter.controller;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Counter {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		return "index.jsp";
			}
			else { 
				Integer count = (Integer) session.getAttribute("count");
				session.setAttribute("count", count+1);
				return "index.jsp";
			}
	}
	

}
