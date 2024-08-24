package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	//Mais modificações
	//Mais modificações no original
	//Mais modificações no clone da pratica

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greeting3() {
		return "Hello, hotfix COM MAIS ERROOO";
	}
}
