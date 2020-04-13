package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring Boot JSP Active Configration!!
 * 스프링 부트 JSP 호출 예제
 * /Users/macbook/git/cylee/src/main/webapp/WEB-INF/views/index.jsp => 해당경로 생성후 jsp 파일 생성
 * */
@Controller
public class HomeController {
	
	@RequestMapping(value="/")
	public String index() {
		return "index";
	}
}
