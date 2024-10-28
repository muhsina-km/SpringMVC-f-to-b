package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ty.Spring.controller.entity.Person;
import com.ty.Spting.controller.service.PersonService;

@Controller
public class LoginController {
	
	@RequestMapping("/show")
	public String showForm() {
		return "login";
	}
	
	@RequestMapping(path="/login", method =RequestMethod.POST)
	public String handleForm(@ModelAttribute Person person, Model model) {
		PersonService service=new PersonService();
		service.save(person);
		return "details";
	}
}