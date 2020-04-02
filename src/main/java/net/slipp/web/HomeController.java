package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring Boot JSP Active Configration!!
 * */
@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
}
