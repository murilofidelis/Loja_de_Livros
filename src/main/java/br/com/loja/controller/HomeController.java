package br.com.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Carrenado produtos");
		return "hello-word";
	}

}
