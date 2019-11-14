package br.com.caelum.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @RequestMapping("/home")
	@ResponseBody
	public String index() {
		return "Bem vindo ao curso Forum Caelum -->";
	}

}