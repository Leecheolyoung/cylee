package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@PostMapping("/create")
	public String create(User urser) {
		System.out.println("urser :"+urser);
		
		return "index";
	}
}