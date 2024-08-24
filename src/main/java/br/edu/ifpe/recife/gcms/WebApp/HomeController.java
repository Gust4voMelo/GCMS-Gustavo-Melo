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
	
	@RequestMapping("/Gustavo")
	public @ResponseBody String greeting2() {
		return "Hello, Gustavo COM ERROOOO";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greeting3() {
		return "Hello, hotfix";
	}
}
