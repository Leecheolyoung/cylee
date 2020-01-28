package net.slipp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	@PostMapping("/create")
	public String create(User urser) {
		System.out.println("urser :"+urser);
		users.add(urser);
		//return "index";
		return "redirect:/list";//아래에있는 메소드를 호출함.=>"list"값을 주면 클래스안에 메소드를 호출하기 때문
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users",users);
		return "list";
	}
}
