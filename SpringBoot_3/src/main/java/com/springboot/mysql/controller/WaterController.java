package com.springboot.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/snacks")
public class WaterController {
	
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome Free Water at CTS !!";
	}
	
	@RequestMapping("/welcome/free")
	public String welcomeAgain() {
		return "Waoo... you win 1 ltr of free cockail !!";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void addWater(@RequestBody UseWater useWater) {
		waterRepository.save(useWater);
		
	}

}
