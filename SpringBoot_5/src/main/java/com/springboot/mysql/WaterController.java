package com.springboot.mysql;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class WaterController {
	
	@Autowired
	private WaterRepository waterRepository;
	
	@RequestMapping("/water")
	public String welcome() {
		return"Welcome for free water at CTS";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String addWater(@RequestBody UseWater useWater) {
		
		waterRepository.save(useWater);
		return"Saved the water in the watertank";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public String deleteWater(@PathVariable("id") Integer id) {
		
		waterRepository.deleteById(id);
		return "Emptied water in water tank";
	}
	
	@RequestMapping("/getwater")
	public List<UseWater> getTankers(){
		List<UseWater> list=new ArrayList<UseWater>();
		waterRepository.findAll().forEach(list::add);
		return list;
	}
}
