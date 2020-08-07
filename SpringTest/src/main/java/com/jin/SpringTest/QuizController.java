package com.jin.SpringTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 

public class QuizController {
	@RequestMapping(value = "/login")
	public String login() {
		return "login" ; 
		
		//WEB_INF//views//login.jsp
	}
	
	@RequestMapping(value = "/loginForm")
	public String loginForm(Model model) {
		model.addAttribute("id", "infiscap");
		model.addAttribute("pw", "jin1234");
		
		return "form/loginForm" ; 		
	}

		
}

