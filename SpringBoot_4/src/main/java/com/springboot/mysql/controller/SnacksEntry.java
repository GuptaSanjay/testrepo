package com.springboot.mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/snacks")
public class SnacksEntry {
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome for free Snacks !!";
	}
	@RequestMapping("/welcome/free")
	public String welcomeAgain() {
		return "Waoo... you win a free pizza !!";
	}

}
