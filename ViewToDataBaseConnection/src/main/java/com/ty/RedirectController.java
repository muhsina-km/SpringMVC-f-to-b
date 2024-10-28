package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	@RequestMapping("/hii")
	public String hii() {
	System.out.println("This is hii method");
	return "redirect:/bye"; 
	}

	@RequestMapping("/bye")
	public String bye() {
	    System.out.println("This is bye method");
	    return "login"; 
	}

//	@RequestMapping("/hil")
//	public RedirectView hil() {
//	    RedirectView view = new RedirectView();
//	    view.setUrl("/bye"); 
//	    return view;
//	}
//	
//	@RequestMapping("/bye")
//	public String bye() {
//	    System.out.println("This is bye method");
//	    return "login"; 
//	}
	
}
