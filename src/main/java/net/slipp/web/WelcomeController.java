package net.slipp.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	/*
	public String welcome(String name, int age, Model model) {
		System.out.println("name : "+name+"age :"+ age);
		model.addAttribute("name",name);
		model.addAttribute("age",age);
		return "welcome";
	}
	*/
	
	public String welcome(Model model) {
		
		List<MyModel> repo = Arrays.asList(new MyModel("cylee1"), new MyModel("cylee2"), new MyModel("cylee3"));
		model.addAttribute("repo",repo);
		
		return "welcome";
	}
}
